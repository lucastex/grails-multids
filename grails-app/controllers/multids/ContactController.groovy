package multids

class ContactController {

    def contactService

    def index() {

        def contactsDs = Contact.findAll([sort:"name", order: "asc"])
        def contactsServerdb = Contact.serverdb.withTransaction { Contact.serverdb.findAll([sort:"name", order: "asc"]) }
        def contactsUserdb = Contact.userdb.withTransaction { Contact.userdb.findAll([sort:"name", order: "asc"]) }
        [contactsDs: contactsDs, contactsServerdb: contactsServerdb, contactsUserdb: contactsUserdb]
    }

    def add() {

        def dbIndex = params.int('id') ?: ((int) (Math.random() * 3))
        def contact = contactService.build()

        if (dbIndex == 0) { Contact.withTransaction             { contact.save()            } }
        if (dbIndex == 1) { Contact.serverdb.withTransaction    { contact.serverdb.save()   } }
        if (dbIndex == 2) { Contact.userdb.withTransaction      { contact.userdb.save()     } }

        redirect action: "index"
    }
}
package multids

class ContactController {

    def index() {

        def contacts = Contact.findAll([sort:"name", order: "asc"])
        [contacts: contacts]
    }
}

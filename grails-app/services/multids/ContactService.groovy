package multids

import grails.transaction.Transactional

@Transactional
class ContactService {

    def build() {
        new Contact(name: "abc")
    }
}

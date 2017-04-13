package multids

import grails.transaction.Transactional

@Transactional
class ContactService {

    def rest

    def build() {

        def resp = rest.get("https://randomuser.me/api/")

        def name = "${resp.json.results.name.first.first()} ${resp.json.results.name.last.first()}"
        new Contact(name: name)
    }
}

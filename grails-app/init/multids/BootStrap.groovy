package multids

class BootStrap {

    def init = { servletContext ->

        new Contact(name: "Big Ben Roethlisberger").save()
        new Contact(name: "Odell Beckham Jr").save()
        new Contact(name: "Aaron Rodgers").save()

    }
    def destroy = {
    }
}

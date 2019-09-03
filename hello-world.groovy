class User {
String name
String givenName() { name }
}

def u = new User(name: 'mrhaki')
println u.givenName()
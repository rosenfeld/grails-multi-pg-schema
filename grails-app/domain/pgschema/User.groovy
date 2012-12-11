package pgschema

class User {
  String name
  String currentUserSchema
  static mapping = {
    version false
    table "users"
    id generator: 'sequence', params: [sequence: 'users_id_seq']
  }

  static constraints = {
    currentUserSchema inList: ['one', 'two']
  }
}

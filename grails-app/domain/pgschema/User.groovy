package pgschema

class User {
  String name
  String current_user_schema
  static mapping = {
    version false
    table "users"
    id generator: 'sequence', params: [sequence: 'users_id_seq']
  }
}

package pgschema

class Field {
  String name

  static mapping = {
    version false
    table "fields"
    id generator: 'sequence', params: [sequence: 'fields_id_seq']
  }
}

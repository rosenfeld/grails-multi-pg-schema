package pgschema

class FieldController {
  static scaffold = Field

  def chooseSchema(String schema) {
    def user = User.get(1)
    if (params.schema) {
      user.currentUserSchema = schema
      user.save flush: true, failOnError: true
    }
    [schema: user.currentUserSchema]
  }
}

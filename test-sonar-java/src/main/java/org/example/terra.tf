resource roleDef "Microsoft.Authorization/roleDefinitions@2022-04-01" { // Sensitive
  name = "example"
  properties {
    permissions = [
      {
        actions = ["*"] // Sensitive
        notActions = []
      }
    ]
    assignableScopes = [
      subscription().id
    ]
  }
}
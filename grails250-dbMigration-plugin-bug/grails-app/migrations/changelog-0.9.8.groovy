databaseChangeLog = {

    changeSet(author: "jglapa", id: "1435323084072-1") {
        createTable(tableName: "a") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "aPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "b_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

}

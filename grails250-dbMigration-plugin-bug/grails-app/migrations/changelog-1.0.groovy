databaseChangeLog = {
    changeSet(author: "jglapa", id: "1435323084072-2") {
        createTable(tableName: "b") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "bPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "a_id", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "col1", type: "varchar(255)") {
                constraints(nullable: "false")
            }

            column(name: "col2", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

}

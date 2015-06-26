databaseChangeLog = {

    changeSet(author: "jglapa", id: "1435323084072-4") {
        addForeignKeyConstraint(baseColumnNames: "b_id", baseTableName: "a", constraintName: "FK61D9990AA9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "b", referencesUniqueColumn: "false")
    }

    changeSet(author: "jglapa", id: "1435323084072-5") {
        addForeignKeyConstraint(baseColumnNames: "a_id", baseTableName: "b", constraintName: "FK62D9989649", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "a", referencesUniqueColumn: "false")
    }

    changeSet(author: "jglapa", id: "1435323084072-6") {
        addForeignKeyConstraint(baseColumnNames: "b_id", baseTableName: "c", constraintName: "FK63D9990AA9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "b", referencesUniqueColumn: "false")
    }


}

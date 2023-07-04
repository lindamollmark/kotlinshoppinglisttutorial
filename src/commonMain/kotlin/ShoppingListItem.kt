import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(var desc: String, val priority: Int) {
 val id : Int = desc.hashCode()

    companion object {
        const val path = "/shoppingList"
    }
}
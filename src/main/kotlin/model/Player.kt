package model

class Player(private val choice: String, private val choiceValue: Int) {

    fun getChoiceValue() = this.choiceValue

    override fun toString(): String {
        return "Player(choice='$choice', choiceValue=$choiceValue)"
    }
}
package gameqanda

class GameController {

    def index() {
        return [game1: "COD", game2: "hitman"]
    }

    def actionGames() {

    }

    def list() {
        def games = ["COD", "Hitman", "IGI", "Forest"]
        return [gameList: games]
    }

    def newgames()
    {
        return [game1: "WARZONE" , game2: "FORTNITE" , game3: "VALORANT"]
    }
}

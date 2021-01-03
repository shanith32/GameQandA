package gameqanda

class GamesController {

    def index() {
        def games = Game.find({})
        def result = "No games yet"
        if(games) result = [games]
        respond([games: result])
    }

    def newGame() {
        def newGame = new Game(name: "Hitman", gameType: "Action", dateCreated: new Date())
        newGame.save()
        redirect(action: index())
    }
}

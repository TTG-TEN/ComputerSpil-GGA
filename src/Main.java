void main() {

GameSystem gameSystem = new GameSystem(10,5);
    Player player1 = new Player(1, "Anders", 22, 150.0);
    Player player2 = new Player(2, "Emma", 20, 230.5);
    Player player3 = new Player(3, "Mikkel", 24, 180.0);
    Player player4 = new Player(4, "Sofie", 21, 95.75);
    Player player5 = new Player(5, "Frederik", 25, 310.0);


Game game1 = new Game(1, "Minecraft", "Sandbox", 199.95);
Game game2 = new Game(2, "Counter-Strike 2", "FPS", 0.0);
Game game3 = new Game(3, "Elden Ring", "Sports", 449.95);
Game game4 = new Game(4, "FIFA 26", "Sports", 599.95);
Game game5 = new Game(5, "The Sims 4", "Simulation", 0.0);
Game game6 = new Game(6, "Cyberpunk 2077", "RPG", 299.95);
Game game7 = new Game(7, "Grand Theft Auto V", "Action", 199.95);
Game game8 = new Game(8, "Stardew Valley", "Simulation", 109.95);

gameSystem.addPlayer(player1);
gameSystem.addPlayer(player2);
gameSystem.addPlayer(player3);
gameSystem.addPlayer(player4);
gameSystem.addPlayer(player5);

gameSystem.addGame(game1);
gameSystem.addGame(game2);
gameSystem.addGame(game3);
gameSystem.addGame(game4);
gameSystem.addGame(game5);
gameSystem.addGame(game6);
gameSystem.addGame(game7);
gameSystem.addGame(game8);

    System.out.println("===========================");

    gameSystem.displayAllGames();
    System.out.println("===========================");

    gameSystem.displayAllPlayers();

    System.out.println("===========================");

    System.out.println("Sofies score: " + player4.getScore());

    gameSystem.updatePlayerScore(4,200);

    System.out.println("Sofies Score: " + player4.getScore());

    gameSystem.displayLeaderboard();

    System.out.println("=============================");

    System.out.println("Find spil: " + gameSystem.findGameById(6).getTitle());
    System.out.println(gameSystem.findPlayerById(10));
    player5.displayDetails();
    System.out.println("=============================");
    System.out.println("Spil 3's gamle genre: " + gameSystem.findGameById(3).getGenre());
    game3.setGenre("RPG");
    System.out.println("Spil 3's nye genre: " + gameSystem.findGameById(3).getGenre());
    System.out.println("=============================");

}
#!/usr/bin/python
print("Content-Type: text/html\n\n")

def pokemontable(data):
    table = "<table border = 1>\n"
    for list in data:
        table += "\t<tr>"
        for item in list:
            table += "<td>" + str(item) + "</td>"
        table += "</tr>\n"
    table += "</table>"
    return table

def top_n(pokemon_numbers, list):
    table = [["<tr><td>Rank</td><td>Front</td><td>Back</td><td>#</td><td>Name</td><td>Type 1</td><td>Type 2</td><td>Total</td><td>HP</td><td>Attack</td><td>Defense</td><td>Sp. Atk</td><td>Sp. Def</td><td>Speed</td><td>Generation</td><td>Legendary</td></tr>"]]
    rank = 1
    for number in pokemon_numbers:
        temptable = []
        temptable.append(str(rank))
        rank += 1
        for pokemon in (list):
            if str(pokemon[2]) == str(number):
                for data in pokemon:
                    temptable.append(data)
        table.append(temptable)
    return pokemontable(table)

def createNavbar(list):
    navbar = ""
    navbar += "<nav>\n"
    navbar += "\t\t<ul>\n"
    for item in list:
        if len(item) <= 1:
            navbar += "\t\t<li><a href=\"./" + str(item[0]) + ".py\">" + str(item[0]) + "</a></li>\n"
        if len(item) > 1:
            navbar += "\t\t<li><a href=\"\">" + str(item[0]) + "</a>\n"
            navbar += "\t\t\t<ul>\n"
            for element_num, element in enumerate(item):
                if element_num > 0:
                    navbar += "\t\t\t<li><a href=\"./" + str(element) + ".py\">" + str(element) + "</a></li>\n"
            
            navbar += "\t\t\t</ul>\n\t\t</li>\n"
    navbar += "\t\t</ul>\n"
    navbar += "\t</nav>"
    return navbar    

with open("pokemon.csv", "r") as text:
    pokemons = []
    for i in range(152):
        with open("img/front/" + str(i) + ".png", "r"):
            with open("img/back/" + str(i) + ".png", "r"):
                temp_pokemons = []
                if i == 0:
                    temp_pokemons.append("Front")
                    temp_pokemons.append("Back")
                else: 
                    temp_pokemons.append("<img src = \"img/front/" + str(i) + ".png\">")
                    temp_pokemons.append("<img src = \"img/back/" + str(i) + ".png\">")
            for data in (text.readline()).split(","):
                temp_pokemons.append(data)
            pokemons.append(temp_pokemons)
    

    webpage = '''
    <html>
        <head>
            <style>
        nav li {
            display: inline-block;
            position: relative;
        }
        nav li ul {
            display: none;
            position: absolute;
            width: 100px;
            top: 100%;
            padding: 0;
        }
        nav li:hover > ul {
            display: block;
        }
        nav a {
        }

        body {
            background-color: Tomato
        }
                p {
                    color: WhiteSmoke;
            font-size: 100%;
                    font-family: "Arial";
                }
                h1{
                    font-size: 500%;
            font-family: "Impact";
                }
        table {
            background-color: WhiteSmoke;
            font-family: "Calibri";
        }
            </style>
        </head>
        <body>
            navbar
            <center><h1><font>TOP 10 POKEMONS</font></h1></center>
            <center><p>In the Pokemon world, Pokemon are sentenced to life as pets for humans. Therefore, this top 10 list will be based on human compatibility.</p></center>
            <br/>
	    <center>TOP10</center>
        </body>
    </html>
    '''

    webpage = webpage.replace("navbar", createNavbar([["Home"], ["AllPokemon"], ["Types", "Normal", "Fire", "Water", "Grass", "Flying", "Fighting", "Poison", "Electric", "Ground", "Rock", "Psychic", "Ice", "Bug", "Ghost", "Steel", "Fairy"], ["Top 10"]]))
    webpage = webpage.replace("TOP10", top_n([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], pokemons))

    print(webpage)

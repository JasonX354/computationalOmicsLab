#!/usr/bin/python
print("Content-Type: text/html\n\n")

NAVBARLIST = [["Home"], ["All Pokemon"], ["Types", "Normal", "Fire", "Water", "Grass", "Flying", "Fighting", "Poison", "Electric", "Ground", "Rock", "Psychic", "Ice", "Bug", "Ghost", "Steel", "Dragon", "Fairy"], ["Top 10"]]

#make own css file
#pg src, make indentations

TEMPLATEPAGE = '''
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="mystyle.css">
    </head>
    <body>
        navbar
        <center><h1><font>[TYPE] POKEMONS</font></h1></center>
        <center><p>TEXT</p></center>
        <center>TABLE</center>
        <br/>
    </body>
</html>'''

def pokemontable(data):
    table = "<table>\n"
    for list in data:
        table += "\t\t\t\t<tr>\n\t\t\t\t\t"
        for item in list:
            table += "<td>" + str(item) + "</td>"
        table += "\n\t\t\t\t</tr>\n"
    table += "\t\t\t</table>"
    return table

def top_n(pokemon_numbers, list):
    table = []
    rank = 1
    header = ["RANK"]
    for element in list[0]:
        header.append(element)
    table.append(header)
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
        if item[0] == "Home":
            navbar += "\t\t<li><a href=\"xie.jason.py\">Home</a></li>\n"
            continue
        if len(item) <= 1:
            navbar += "\t\t<li><a href=\"" + str(item[0]) + ".html\">" + str(item[0]) + "</a></li>\n"
        if len(item) > 1:
            navbar += "\t\t<li><a href=\"\">" + str(item[0]) + "</a>\n"
            navbar += "\t\t\t<ul>\n"
            for element_num, element in enumerate(item):
                if element_num > 0:
                    navbar += "\t\t\t\t<li><a href=\"" + str(element) + ".html\">" + str(element) + "</a></li>\n"  
            navbar += "\t\t\t</ul>\n\t\t</li>\n"
    navbar += "\t\t</ul>\n"
    navbar += "\t\t</nav>"
    return navbar

def makeTypeTable(type, list):
    temp_list = []
    temp_list.append(list[0])
    for pokemon in list:
        for element in pokemon:
            if element == type or element == type:
                temp_list.append(pokemon)
    return pokemontable(temp_list)

def newTypeWebpage(type_pokemon, list):
    with open(str(type_pokemon) + ".html", "w") as file:
            page = TEMPLATEPAGE.replace("navbar", createNavbar(NAVBARLIST))
            page = page.replace("[TYPE]", str(type_pokemon).upper())
            page = page.replace("TABLE", makeTypeTable(type_pokemon, list))
            page = page.replace("TEXT", "")
            file.write(str(page))

homepage = TEMPLATEPAGE.replace("navbar", createNavbar(NAVBARLIST))
homepage = homepage.replace("[TYPE]", "INTRODUCTION TO")
homepage = homepage.replace("TABLE", "")
homepage = homepage.replace("TEXT", "Pokemon (aka Pocket Monsters) is a Japanese franchise founded by Nintendo. The franchise is centered on Pokemon trainers who catch and train fictional creatures called \"Pokemon\" to battle each other for entertainment. Pokemon is a multi-billionaire franchise that currently contains 900+ creatures for trainers to catch, however only 151 pokemon will be featured in this webpage. On the upper left of the page, click \"All Pokemon\" to view a table of all 151 pokemon, or hover over \"Types\" to sort by type. Both tables will be sorted by Pokedex number. Additionally, you can press \"Top 10\" to view my own personal top 10 pokemon.")
print(homepage)

with open("mystyle.css", "w") as file:
    style = '''
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
    background-color: Tomato;
    border-style: solid;
}
nav li:hover > ul {
    display: block;
}
nav a {
}
body {
    background-color: Tomato;
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
table, th, td {
    background-color: WhiteSmoke;
    font-family: "Calibri";
    border: 1px solid;
}'''
    file.write(style)


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
                data = data.strip()
                temp_pokemons.append(data)
            pokemons.append(temp_pokemons)

    for type in NAVBARLIST[2][1:]:
        newTypeWebpage(type, pokemons)

    with open("All Pokemon.html", "w") as file:
        page = TEMPLATEPAGE.replace("navbar", createNavbar(NAVBARLIST))
        page = page.replace("[TYPE]", "ALL")
        page = page.replace("TABLE", pokemontable(pokemons))
        page = page.replace("TEXT", "Below is a table of all 151 pokemon.")
        file.write(page)
    
    with open("Top 10.html", "w") as file:
        page = TEMPLATEPAGE.replace("navbar", createNavbar(NAVBARLIST))
        page = page.replace("[TYPE]", "TOP 10")
        page = page.replace("TABLE", top_n([134, 6, 146, 150, 130, 108, 68, 132, 65, 129], pokemons))
        page = page.replace("TEXT", "Pokemon are a human's best friends. Therefore, this top 10 list will be sorted by a pokemon's compatibility with humans. The more helpful they are in a pokemon master's journey, the higher they will be ranked.")
        file.write(page)


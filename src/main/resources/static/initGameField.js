const promise = getData();
const chars = 'ABCDEFGH';
const digits = '87654321';
promise.success(function (data) {
  let table = document.createElement("table");
  for (let i = 0; i < 8; i++) {
      let tr = document.createElement('tr');
      for (let j = 0; j < 8; j++) {
      let att = document.createAttribute('cell');
      att.value = chars.charAt(j) + digits.charAt(i);
          let td = document.createElement('td');
          td.setAttributeNode(att);
          if (i%2 == j%2) {
              td.className = "white";
              td.style = "background-color: #fcbe03;"
          } else {
              td.className = "black";
              td.style = "background-color: #fc9403;"
          }
          tr.appendChild(td);
      }
      table.appendChild(tr);
  }
  document.body.appendChild(table);
  setFiguresOverChessField(document.querySelectorAll('td'));

});

function setFiguresOverChessField(cells) {
  cells.forEach(cell => {
    if (cell.getAttribute('cell').includes('2')) {
        cell.style.backgroundImage = 'url(pawn-white.png)';
    } else if(cell.getAttribute('cell').includes('7')) {
        cell.style.backgroundImage = 'url(pawn-black.png)';
    }
    setImage(cell, 'B1', 'url(knight-white.png)');
    setImage(cell, 'G1', 'url(knight-white.png)');
    setImage(cell, 'B8', 'url(knight-black.png)');
    setImage(cell, 'G8', 'url(knight-black.png)');

    setImage(cell, 'C1', 'url(bishop-white.png)');
    setImage(cell, 'F1', 'url(bishop-white.png)');
    setImage(cell, 'C8', 'url(bishop-black.png)');
    setImage(cell, 'F8', 'url(bishop-black.png)');

    setImage(cell, 'A1', 'url(rook-white.png)');
    setImage(cell, 'H1', 'url(rook-white.png)');
    setImage(cell, 'A8', 'url(rook-black.png)');
    setImage(cell, 'H8', 'url(rook-black.png)');

    setImage(cell, 'D1', 'url(queen-white.png)');
    setImage(cell, 'D8', 'url(queen-black.png)');

    setImage(cell, 'E1', 'url(king-white.png)');
    setImage(cell, 'E8', 'url(king-black.png)');

    cell.style.backgroundSize = '100% 100%';
  });
}

function setImage(cell, position, image) {
    if(cell.getAttribute('cell').includes(position)) {
        cell.style.backgroundImage = image;
    }
}

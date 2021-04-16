/*
 */

function makeGrid(rows, cols) {
  let grid = new Array(rows);

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      grid[i] = new Array(cols);
    }
  }
  return grid;
}

function initGrid(grid, rows, cols) {
  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      grid[i][j] = Math.floor(Math.random() * 2);
    }
  }
}

let grid;
let next;
let rows;
let cols;
let resol = 20;

function setup() {
  createCanvas(600, 400);
  cols = height / resol;
  rows = width / resol;
  grid = makeGrid(rows, cols);
  initGrid(grid, rows, cols);
}
console.table(grid);
function draw() {
  background(0);

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      x = i * resol;
      y = j * resol;
      if (grid[i][j] == 1) {
        fill(255);
        stroke(0);
        rect(x, y, resol - 1, resol - 1); // draw all rectangles 1 pixel less
      }
    }
  }
  next = makeGrid(rows, cols);
  // for (let i = 0; i < rows; i++) {
  //   for (let j = 0; j < cols; j++) {
     
  //     console.log(neighbors);
  //     let state = grid[i][j];
  //     if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
  //       next[i][j] = state;
  //     } else {
  //       if (state == 0 && neighbors == 3) {
  //         next[i][j] = 1;
  //       } else if (
  //         (state == 1 && neighbors < 2) ||
  //         (state == 0 && neighbors > 3)
  //       ) {
  //         next[i][j] = 0;
  //       } else {
  //         ne // let neighbors = countNeighbor(grid, i, j);xt[i][j] = state;
  //       }
  //     }
  //   }
  // }
  grid = next;
}

// function countNeighbor(grid, x, y) {
//   let sum = 0;
//   for (let k = -1; k < 2; k++) {
//     for (let l = -1; l < 2; l++) {
//       sum += grid[x + k][y + l];
//     }
//   }

//   sum -= grid[x][y]; //subtract myself.
//   return sum;
// }

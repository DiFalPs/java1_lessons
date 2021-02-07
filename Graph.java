package ru.geekbrains.jalgorimts.lesson7;

public class Graph {
    private class Vertex {
        char label;
        boolean wasVisited;

        public Vertex(char label) {
            this.label = label;
            this.wasVisited = false;
        }

        @Override
        public String toString() {
            return String.format("V=%c", label);
        }
    }

    private final int MAX_VERTICES = 16;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int currentSize;

    public Graph() {
        vertexList = new Vertex[MAX_VERTICES];
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        currentSize = 0;
    }

    public void addVertex(char label) {
        vertexList[currentSize++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1; // change 1 to weight for weight
        adjacencyMatrix[end][start] = 1; // delete this for direction
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v] + " ");
    }

    private int getUnvisitedVertex(int current) {
        for (int i = 0; i < currentSize; i++) {
            if (adjacencyMatrix[current][i] == 1 &&
                    !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    public void depthTraverse() {
        Stack stack = new Stack(MAX_VERTICES);
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        resetFlags();
    }

    public void widthTraverse() {
        Queue queue = new Queue(MAX_VERTICES);
        vertexList[0].wasVisited = true;
        queue.insert(0);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            displayVertex(current);
            int next;
            while ((next = getUnvisitedVertex(current)) != -1) {
                vertexList[next].wasVisited = true;
                queue.insert(next);
            }
        }
        resetFlags();
    }
    public void shortPath(int valueFrom, int valueTo) {
        Queue queue = new Queue(MAX_VERTICES);
        int[] vertexD = new int[currentSize];
        vertexList[valueFrom].wasVisited = true;
        queue.insert(valueFrom);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            int next;
            while ((next = getUnvisitedVertex(current)) != -1) {
                vertexList[next].wasVisited = true;
                vertexD[next] = vertexD[current] + 1;
                if (next != valueTo) {
                    queue.insert(next);
                } else {
                    Stack result = new Stack(currentSize);
                    result.push(next);
                    result.push(current);
                    int d = vertexD[current];
                    for (int i = 0; i < d; i++) {
                        for (int j = 0; j < currentSize; j++) {
                            if (adjacencyMatrix[j][current] == 1 && vertexD[j] == (vertexD[current] - 1)) {
                                result.push(j);
                                current = j;
                                break;
                            }
                        }
                    }
                    while (!result.isEmpty()) {
                        displayVertex(result.pop());
                    }
                    resetFlags();
                    return;
                }
            }
        }
        resetFlags();
    }

    private void resetFlags() {
        for (int i = 0; i < currentSize; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex('q');
        g.addVertex('w');
        g.addVertex('e');
        g.addVertex('r');
        g.addVertex('t');
        g.addVertex('y');
        g.addVertex('u');
        g.addVertex('i');
        g.addVertex('o');
        g.addVertex('p');
        g.addEdge(0, 1);
        g.addEdge(1, 4);
        g.addEdge(0, 2);
        g.addEdge(2, 5);
        g.addEdge(4, 9);
        g.addEdge(4, 6);
        g.addEdge(0, 3);
        g.addEdge(3, 5);
        g.addEdge(5, 8);
        g.addEdge(8, 9);
        g.addEdge(4, 7);
        g.shortPath(0, 9);
        System.out.println();
        g.shortPath(1, 6);
        System.out.println();
        g.shortPath(3, 8);
        System.out.println();
        g.shortPath(0, 9);
    }
}

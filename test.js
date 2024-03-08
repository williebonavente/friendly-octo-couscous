class Book {
    constructor(title, author, year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    getSummary() {
        return `${this.title} was written by ${this.author} in ${this.year}.`;
    }
}

// Create a new book object
const book1 = new Book("Introduction to Java Programming", "Pomperada", "Revised Ed.");

// Get the summary of the book
console.log(book1.getSummary());
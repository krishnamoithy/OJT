// script.js

// Sample data for media posts
const mediaPosts = [
    { title: "Media 1", url: "https://youtube.com/shorts/UTCz1UccKaQ?si=quKjrO2U_e706Uta" },
    { title: "Media 2", url: "https://www.w3schools.com/html/movie.mp4" },
    { title: "Media 3", url: "https://www.w3schools.com/html/mov_bbb.mp4" },
    { title: "Media 4", url: "https://www.w3schools.com/html/movie.mp4" }
];

// Function to load media posts into the DOM
function loadMediaPosts() {
    const container = document.getElementById('media-post-container');
    mediaPosts.forEach((post, index) => {
        const div = document.createElement('div');
        div.className = 'media-post';
        div.dataset.index = index;
        div.innerHTML = `
            <video controls preload="none">
                <source src="${post.url}" type="video/mp4">
                Your browser does not support the video tag.
            </video>
        `;
        container.appendChild(div);
    });
}

// Function to handle scrolling between media posts
let currentIndex = 0;
function showMedia(index) {
    const posts = document.querySelectorAll('.media-post');
    posts.forEach((post, i) => {
        post.style.top = `${(i - index) * 1000}%`;
        const video = post.querySelector('video');
        if (i === index) {
            video.play();
        } else {
            video.pause();
            video.currentTime = 0;
        }
    });
}

function handleScroll(event) {
    const direction = event.deltaY > 0 ? 1 : -1;
    currentIndex = Math.min(Math.max(currentIndex + direction, 0), mediaPosts.length - 1);
    showMedia(currentIndex);
}

// Initialize the page
document.addEventListener('DOMContentLoaded', () => {
    loadMediaPosts();
    showMedia(currentIndex);
    window.addEventListener('wheel', handleScroll);
});

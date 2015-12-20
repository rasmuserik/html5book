# HTML5 - web og apps

*This is an early pre-pre-draft*

Udkast til indholdsfortegnelse:

- Indledning 
    - Bogens formål: oversigtstur over html5 - fokus på udvikling/api'er og ikke webdesign. Subjektivt, baseret på egne interesser
    - Målgruppe
        - Overblik over hvad man kan for ikke-teknikere
        - Inspiration for udviklere
    - Om forfatteren
- Hvad er HTML5 - HTML5 platformen (overblik: ikke-teknisk)
    - Hvad er HTML5
    - Web - website, cms widgets
    - Apps - native, hybrid, 
    - HTML
    - CSS
    - JavaScript
    - Frontend og Backend
    - JSON
- HTML5 Byggeklodser
    - Input
        - Touch
        - GPS
        - Kamera/mikrofon
        - Orientering
        - fil "download"
        - battery status, page-visibility, netværskinformation, ambient-light
    - Visuelt
        - DOM og CSS - animations, shadows, ...
        - SVG - vektor grafik
        - Canvas - 2d - simpel raster grafik
        - WebGL - 3d/2d grafik acceleret med grafikkort
        - fullscreen
    - Medier
        - Video (preload, etc.)
        - Lyd
        - Webspeech
    - Netværk og multitasking
        - webrtc
        - websocket
        - appcache
        - messages
        - webworkers
        - service-workers
        - CORS
    - Performance
        - binære data
        - timing
        - Generational garbage collection
        - Implicitte klasser og polymorfic inline caching
        - Implicitte typer, og asm.js, and webassembly
    - Lager
        - fileapi
        - localstorage
        - database: indexeddb/websql
    - Diverse
        - App-config config.xml, manifest.json, meta/link-headers
        - Semantic web
        - Notifications
        - Kryptografi
        - Blobs
        - vibration
        - promises
- Kom i gang med udvikling: step-by-step 1-dags kursus
    - Github-account
    - cloud-9
    - npm start projekt
    - kørsel af kodeeksempler fra bogen (hjælperedskaber fra bogen)
- Funktionsbiblioteker
    - React + react-native
    - localforage
    - PouchDB
    - Leaflet
    - Markdown
    - D3.js
    - pixi.js
    - Phaser
    - IPFS
    - Three.js
    - socket.io
    - modernizr
    - evt. ionic
    - lodash/underscore, async, 
- Programmeringssprog
    - JavaScript/EcmaScript
        - JSON.stringify serialisation..
        - transpiling, vs. ES3/ES5
        - typed-arrays, let, lambda-functions, string-interpolation
        - Moduler
        - Promises
        - Klasser
        - Generators
        - Symboler, Map, Set, ...
        - imul, clz32 ES7?: SIMD
    - Emscripten - llvm
        - Unity, Unreal-Engine, Godot, Ogre
        - Legacy-kode
        - C/C++, og andre sprog
    - ClojureScript
        - CSP/core.async
        - Reaktiv programmering
        - Logikprogrammering
        - Closure-compiler
        - persistent data structure (also immutable-js)
        - Modulsystem
- Værktøj
    - Versionsstyring og Github
    - GitHub - readme, badges...
    - Test
    - npm
    - Editor
    - Markdown
    - Kodekvalitet / Linting
    - CI travis+browser
    - Bundling, - webpack, ...
    - browser-autoload
    - Cordova/PhoneGap - plugins, crosswalk
    - Open Source
- Referencer og links
    - tutorials
    - referencematerialer
    - HTML5 i København
        - netværksgrupper
        - virksomheder
</div><div class="page">

# Indledning

</div><div class="page">
# Hvad er HTML5

</div><div class="page">
# HTML5 funktionalitet

</div><div class="page">
# Kom i gang med udvikling

</div><div class="page">
# Funktionsbiblioteker

</div><div class="page">
# Programmeringssprog

</div><div class="page">

# Værktøj

## Versionsstyring - `git`

Versionsstyring er et redskab, der gemmer forskellige udgaver af de filer man arbejder med.
Dette giver backup- og undo-funktionalitet, hvor man kan finde tidligere versioner frem.
Samtidigt kommer der også en historik, så man kan se hvem der har lavet hvilke ændringer. 
Det indeholder også funktionalitet til at håndtere når flere har redigeret de samme filer,
og er er et vigtigt samarbejdsværktøj. Stortset al softwareudvikling foregår med versionsstyring.

Git er det mest udbredte versionsstyringssoftware. Terminologi:

- et *repositorie* er den samlede beholder for historikken og alle versionerne.
- et *commit* er et punkt i historikken, og indeholder ændringer af en eller flere filer
- at *klone* et et repositorie, vil sige at lave en ny kopi af koden, typisk på sin egen computer. Denne kan så senere merges tilbage til serveren.
- et *pull* / *push* er en opdatering af en kopi fra / til et andet repositorie.
- en *diff* er forskellen mellem to versioner. Versionstyringsprogrammer gemmer også historikken som ændringer, fremfor at kopiere alle filerne.
- at *merge* to versioner af koden, vil sige at flette dem sammen igen, så den nye udgave indeholder ændringerne i begge.
- en *branch* er en forgrening af historien. Kan tænkes som en navngivet kopi af koden, som senere kan merges.
- et *remote* repositorie, er et som har den samme kode, og som er konfigureret til let at pull'e fra og eventuelt push'e til.

Det kan naturligvis bruges til alle slags filer, og ikke blot kode. 
Eksemplevis er historikken for denne bog styret via git.

### Git Cheat Sheet


Konfigurer default remote, og kopier koden derover:

    git remote add origin $GIT_URL
    git push -u origin master


Lav ny branch

    git checkout -b BRANCH


## GitHub

</div><div class="page">
# Referencer og links

# Vista pública

Vista pública de las clases que componen [la solución](/src/App.java)

## [Monkey](/src/Monkey.java)

- `void update()`
- `String tellState()`
- `boolean hasEscaped()`
- `boolean isTired()`

## [Weather](/src/Weather.java)

- `void update()`
- `String tellState()`
- `boolean isRaining()`
- `boolean isRainingHard()`

## [Boy](/src/Boy.java)

- `void update(Weather weather)`
- `double advance()`
- `String tellState()`

## [Mother](/src/Mother.java)

- `void update(Weather weather)`
- `double advance()`
- `String tellState()`

## [Journey](/src/Journey.java)

- `Journey(int initialDistance)`
- `start()`



# Slenium project 
 project for practical purposes


- maven : 
```bash
mvn clean test
```

- abstracting the behavior using strategy pattern
- page factory

algorithm to verify that the order by time duration is true.
travellocity-qa/src/main/java/components/FlightCard.java
```java
    public boolean sortByDurationSorted() {
        WebDriverWaitUtils.waitUntilClickableOfElement(getDriver(), sortDropdownBy);
        Select selectSortedType = new Select(sortDropdownBy);
        selectSortedType.selectByVisibleText("Duration (Shortest)");
        WebDriverWaitUtils.waitUntilVisibilityOfElements(getDriver(), durationFlights);
        List<String> timeValueResults = durationFlights.stream()
                .map(WebElement::getText)
                .filter(e -> e.matches("\\d\\dh\\s\\dm|\\dh\\s\\dm"))
                .map(s -> s.replaceAll("h","0"))
                .map(s -> s.replaceAll("[^0-9]", ""))
                .collect(Collectors.toList());

        System.out.println(timeValueResults);
        return Ordering
                .natural()
                .isOrdered(
                        new ArrayList<>(
                                timeValueResults
                                        .stream()
                                        .map(Integer::valueOf)
                                        .collect(Collectors.toList()))
                );
    }
```

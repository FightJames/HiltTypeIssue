# HiltTypeIssue

## First take a look dependency of project.

app (application module) -> lib-base (library module) -> module-tool (library module)

## Crash root cause.

Remember that Hilt will generate injectors at application module which is app module. So when lib-base use hilt to inject module-tool objects to its activities.
**The Hilt will not find the corresponding injector because there is no dependency between app module and module-tool.**

## Solution
Add dependency of module-tool at app module.
The dependency will be.

```
app -> lib-base -> module-tool
    -> module-tool
```

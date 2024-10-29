```mermaid
---
title: Role Hierarchy
---
classDiagram
Employee "1..*" o-- "1" Role 
Role <|-- Member
Role <|-- Admin
```

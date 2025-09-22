# Welcome to COMP2000 - Object Oriented Programming Practices
## Session 2, 2025

Please ensure that you follow the weekly updates in this repository

You are free to clone this repository into your own hosted git environment, such as Github, Bitbucket, or Gitlab.

*However*, please be aware that any repository containing your assignment code **must** be made private. Any repository with assignment code that is public available, or found to be shared with other students, will be considered a violation of the academic integrity policy.



COMP2000 2025 – Assignment
Overview

This project builds on the Week 5 classwork repository and demonstrates a small grid-based game environment.
It integrates terrain types, actors, and collectible items on a 20x20 grid.

The program is designed to demonstrate good object-oriented design through inheritance, interfaces, and generics.

Features Implemented

Terrain system (Task 1)

Terrain interface allows multiple terrain types (e.g., Grass, Water).

GrassCell and WaterCell extend Cell and implement Terrain.

The grid paints terrain types and shows the type of the cell under the mouse.

Actors (Task 2)

Actor superclass defines shared properties and painting behavior.

Subclasses (Cat, Dog, Bird) inherit from Actor and define specific appearance via polygons.

Each actor has a Cell location and its own inventory for collecting items.

Items and Generics (Task 2)

Item base class defines shared item properties and painting behavior.

Concrete items (Bone, Fish, Seed) extend Item.

Inventory<T> is a custom generic class used for both actors and the stage.

This demonstrates a reusable and type-safe container, highlighting intelligent use of generics.

Stage

Contains the grid, all actors, and all items.

Handles painting of all components and displays hover information.

Design Insights

Inheritance

Actor → Cat, Dog, Bird

Item → Bone, Fish, Seed

Cell → GrassCell, WaterCell

This hierarchy allows shared behavior to live in the superclass, reducing code repetition and enabling easy future expansion.

Interfaces

Terrain interface allows multiple terrain types to be added without changing the core Grid or Cell classes.

Generics

Inventory<T> provides a reusable and type-safe container for items.

Each actor has its own inventory of Item objects, and the stage can maintain a global inventory as well.

Using generics avoids code duplication and ensures type safety.
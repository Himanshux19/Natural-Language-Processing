# 🧠 NLP Extractor (Learning Project)

This project is built to **learn and implement core NLP (Natural Language Processing) concepts** such as:

* Part-of-Speech Tagging (POS)
* Named Entity Recognition (NER)
* Lemmatization
* Tokenization

It uses **Java + Spring Boot** along with Stanford CoreNLP to process and extract meaningful information from text input.

## 🚀 Features

* 🔍 Extract named entities like **Person, Location, Organization**
* 🏷️ Identify **Part-of-Speech (POS)** tags
* ✂️ Perform **tokenization** and **lemmatization**
* ⚡ Simple REST API for NLP processing
* 🌐 Frontend deployed using Netlify for interaction

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **NLP Library:** Stanford CoreNLP

## 📌 API Endpoint

```
POST /api/v1/ner?type=PERSON
```

### Request Body:

```
Barack Obama lives in the United States.
```

### Response:

```
["Barack Obama"]
```

## 🎯 Purpose

This project is **not production-focused**, but created to:

* Understand how NLP pipelines work
* Learn how text is processed into structured data
* Explore backend integration of NLP models

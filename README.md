# Tribefire: a Platform for Platforms driven by Normalised Models

This is a companion public git repository of the tool demo paper submitted to Models 2019.
It includes:

  - Additional links to Tribefire Academy and Documentation portals
  - Prototype of a Ecore2GmModel transformation.

# Additional Links
The additional links are grouped following the roadmap of the submitted paper.

### Introduction
### Cortex Approach
### Tribefire By Example
### Related Work

# Ecore2GmModel Transformation Prototype
The Ecore2GmModel Prototype is a model transformation implemented in by a combination of [EOL]((https://www.eclipse.org/epsilon/doc/eol/)), [EGL](https://www.eclipse.org/epsilon/doc/egl/) and [EGX](https://www.eclipse.org/epsilon/doc/egx/) specifications, three DSLs provided by the [Eclipse Epsilon](https://www.eclipse.org/epsilon/) framework. 
EOL is an imperative programming language for creating, querying and modifying EMF models. 
EGL is a template-based model-to-text language for generating code, documentation and other textual artefacts from models. EGX is a rule-based language for coordinating the execution of EGL templates.

The transformation take a single input (.ecore) and generates multiple outputs, i.e., Java Interfaces representing a Data Model (data-model) in the Cortex Modeling Space (see paper for further details).

Ecore2GmModel is performed in two steps. 
The first step adds a set of  [eAnnotations](https://download.eclipse.org/modeling/emf/emf/javadoc/2.9.0/org/eclipse/emf/ecore/EAnnotation.html) (namely GmCore) to Ecore model elements. 
The annotations are required and used by the second step to optimise the transformation process, by enabling: 
- Deletion or Replacement of EClasses and, then, update of EStructutalFeatures typed by the involved EClasses (via GmCore::ignored and GmCore::replaceBy eAnnotations). 
- Replacement of Ecore PrimitiveTypes with Tribefire [Simple Types](https://documentation.tribefire.com/javadoc/index.html) (via GmCore::replaceBy eAnnotations). 

The generated Java APIs can be used during the Modeling and Implementation activities of the Cortex Engineering Process outlined in the paper. In particular, the outout of the model transformation is classified as a [Model Priming asset](https://documentation.tribefire.com/tribefire.cortex.documentation/concepts-doc/features/platform_assets.html?searchText=ModelPrimings).

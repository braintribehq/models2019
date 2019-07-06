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


The transformation have been tested in many proof-of-value case studies. The output of all case studies is a set of Java Model APIs representing Data Models to be used as part of a DDSA-based extension of Tribefire (see paper for further details).

In order to execute the transformation, the latest version of the [Eclipse Epsilon framework] (https://www.eclipse.org/epsilon/download/) have to installed in Eclipse (preferred installation package [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/))

### Case Study 1
Db.ecore is a simple Ecore Model defining the generic structure of a DB in Ecore. 
The DB.ecore model (available in Ecore2GmModel/model/DB.ecore) is annotated with GmCore annotations. No values are added to annotations and they do not influence the generation of the Java Model API for TF.

Run the case study:
1. Copy paste the Ecore2GmModel/model/DB.ecore in Ecore2GmModel/model/annotated/ (overwrite if asked).
2. Run Ecore2GmModel/launchers/DB/DB_Step1_Annotation.launch. Ecore2GmModel/model/annotated/DB.ecore is annotated with GmCore.
3. Run DB_Step2_Java_ModelAPI_Generation.launch. Ecore2GmModel/model/annotated/DB.ecore is converted to Java Model API for TF.
The output is generated in Ecore2GmModel/transformations/output/db folder. The db folder is a valid source code package that can be copied in a Tribefire Cartridge as part of Model Priming platform asset.

### Case Study 2
ISO 20022 is the Universal financial industry message scheme. The Ecore (meta)model is available [here](https://www.iso20022.org/e_dictionary.page).
The ISO 20022.ecore model (available in Ecore2GmModel/model/ISO20022.ecore) is annotated with GmCore annotations. No values are added to annotations and they do not influence the generation of the Java Model API for TF. It is not optimised since it defined primitive types (e.g. String) that should be replaced by Tribefire Simple Types.

Run the case study:
1. Copy paste the Ecore2GmModel/model/ISO20022.ecore in Ecore2GmModel/model/annotated/ (overwrite if asked).
2. Run Ecore2GmModel/launchers/ISO20022/ISO20022_Step1_Annotation.launch. Ecore2GmModel/model/annotated/ISO20022.ecore is annotated with GmCore.
3. Run ISO20022_Step2_Java_ModelAPI_Generation.launch. Ecore2GmModel/model/annotated/ISO20022.ecore is converted to Java Model API for TF.
The output is generated in Ecore2GmModel/transformations/output/iso20022 folder. The iso20022/ folder is a valid source code package that can be copied in a Tribefire Cartridge as part of Model Priming platform asset.

### Case Study 3 
HL7 FHIR Fast Healthcare Interoperability Resources (FHIR®, pronounced "fire") is a next generation standards framework that leverages the latest web standards and applies a tight focus on implementation and was developed by healthcare standards developing organization, Health Level Seven International (HL7).

HL7 FHIR Fast Healthcare Interoperability Resources (FHIR®, pronounced "fire") is a next generation standards framework that leverages the latest web standards and applies a tight focus on implementation and was developed by healthcare standards developing organization, Health Level Seven International (HL7).
The fhir.ecore model is obtained from the XSD specification publicly available [here](https://www.hl7.org/fhir/downloads.html).
It has been converted in Ecore thanks to the built-in [XSD2Ecore transformation](https://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf). The output is not optimised and many antipatterns should be removed. The antipattern detection is performed by Ecore2GmModel/transformations/epsilon/eol/Step1Annotation/FhirSpecificGmCoreAnnotations.eol, a specialisation of Ecore2GmModel/transformations/epsilon/eol/Step1Annotation/GenericGmCoreAnnotation.eol.

Run the case study:
1. Copy paste the Ecore2GmModel/model/fhir.ecore in Ecore2GmModel/model/annotated/ (overwrite if asked).
2. Run Ecore2GmModel/launchers/ISO20022/FHIR_Step1_Annotation.launch. Ecore2GmModel/model/annotated/fhir.ecore is annotated with GmCore.
3. Run FHIR_Step2_Java_ModelAPI_Generation.launch. Ecore2GmModel/model/annotated/fhir.ecore is converted to Java Model API for TF.
The output is generated in Ecore2GmModel/transformations/output/fhir folder. The fhir/ folder is a valid source code package that can be copied in a Tribefire Cartridge as part of Model Priming platform asset.

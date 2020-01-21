# Tribefire: a Platform for Platforms driven by Normalised Models
This is a companion public git repository of the tool demo paper submitted to Models 2019.
It includes:

  - Additional links to Tribefire Academy and Documentation portals
  - Prototype of a Ecore2GmModel transformation.
  
![alt text](https://github.com/braintribehq/models2019/blob/master/Documents/fig-tf-architecture2.png)
Figure 1. The DDSA-based architecture of Tribefire.

![alt text](https://github.com/braintribehq/models2019/blob/master/Documents/fig-process.png)
Figure 2. The Cortex Engineering Process (CEP) where the Tribefire platform is customised to build new platforms.

# Additional Links
A deep dive into the Cortex approach and Tribefire tool is possible via the [Tribefire Academy Portal](https://academy.tribefire.com/). It includes two sections, Training and Documentation, that are freely accessible.

In [Training](https://academy.tribefire.com/training/), the user is guided through the setup of a [Tribefire Virtual Machine] (https://academy.tribefire.com/license-agreement/)
Sets of videos/slides/exercises are available for 
  - [**Technical Base Course**](https://academy.tribefire.com/tribefire-tech-basics-course/).
  - **Front-End Development** via [Tribefire REST API](https://academy.tribefire.com/rest-api-v2/) (https://academy.tribefire.com/tribefire-tech-basics-course/) and [Tribefire JavaScript API](https://academy.tribefire.com/tribefirejs-introduction/)
  - **Tribefire Extension** via [Java API](https://academy.tribefire.com/tribefire-java-api/) 
For convenience, [**Downloads**] are collected in a single page [here](https://academy.tribefire.com/downloads/)


in [Documentation](https://documentation.tribefire.com/), you can find detailed written explanations about TF, its features, and its cloud-based deployment. The implementation of the case study in Figure 1 is available [here](https://documentation.tribefire.com/tribefire.extension.demo/tribefire-demo-cartridge-doc/ddsa_employeesbygender.html?searchText=employee%20by%20gender).

# Ecore2GmModel Transformation Prototype
The Ecore2GmModel Prototype is a model transformation implemented in by a combination of [EOL](https://www.eclipse.org/epsilon/doc/eol/), [EGL](https://www.eclipse.org/epsilon/doc/egl/) and [EGX](https://www.eclipse.org/epsilon/doc/egx/) specifications, three DSLs provided by the [Eclipse Epsilon](https://www.eclipse.org/epsilon/) framework. 
**EOL** is an imperative programming language for creating, querying and modifying EMF models. 
**EGL** is a template-based model-to-text language for generating code, documentation and other textual artefacts from models. 
**EGX** is a rule-based language for coordinating the execution of EGL templates.

The transformation takes a **single input (.ecore)** and generates **multiple outputs**, i.e., **Java Interfaces representing a Data Model (data-model, see Figure 1)**  in the Cortex Modeling Space (see paper for further details).

**Ecore2GmModel is performed in two steps**. 
**Step 1. Annotation.** 
The first step adds a set of  [eAnnotations](https://download.eclipse.org/modeling/emf/emf/javadoc/2.9.0/org/eclipse/emf/ecore/EAnnotation.html) (namely GmCore) to Ecore model elements. 

**Step 2. Transformation.** 
The annotations are required and used by the second step to optimise the transformation process, by enabling: 
- Deletion or Replacement of EClasses and, then, update of EStructutalFeatures typed by the involved EClasses (via GmCore::ignored and GmCore::replaceBy eAnnotations). 
- Replacement of Ecore PrimitiveTypes with Tribefire [Simple Types](https://documentation.tribefire.com/javadoc/index.html) (via GmCore::replaceBy eAnnotations). 

The generated Java APIs can be used during the Modeling and Implementation activities of the Cortex Engineering Process outlined in the paper. In particular, the outout of the model transformation is classified as a [Model Priming asset](https://documentation.tribefire.com/tribefire.cortex.documentation/concepts-doc/features/platform_assets.html?searchText=ModelPrimings).

**The transformation have been tested in many proof-of-value case studies**. The output of all case studies is a set of Java Model APIs representing Data Models to be used as part of a DDSA-based extension of Tribefire (see paper for further details).



## Case Studies
All case studies can be displayed in Tribefire via Datapedia, an internal assets (including data assets) repository developed at Braintribe.

![alt text](https://github.com/braintribehq/models2019/blob/master/Documents/academic%20workspace.png)



To access Datapedia as guest users:
- Go to [Datapedia](https://datapedia.tribefire.cloud/#/signin)
- Access as Guest User with read only access (username: DisimUser, password: disim).  
- Click on Model Assets. 
- Click on asseet of your choice.
- A new informative page is displayed. On the top menu click on Versions.
- An IFrame will be opened showing a Tribefire Model within a running Tribefire platform (with limited functionalities)
- The chosen model can be inspected.

Here below, we outline three running case studies where the Ecore2GmModel transformation generated the Model APIs that, once installed in Tribeifre, are parsed and generate the the corresponding in-memory representation that are finally shown in the graph-based graphical models editor.

### Install Epsilon 
In order to execute the transformations of the case studies, the latest version of the [Eclipse Epsilon framework] (https://www.eclipse.org/epsilon/download/) have to installed in Eclipse (preferred installation package [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/))

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
The fhir.ecore model is obtained from the XSD specification publicly available [here](https://www.hl7.org/fhir/downloads.html).
It has been converted in Ecore thanks to the built-in [XSD2Ecore transformation](https://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf). The output is not optimised and many antipatterns should be removed. The antipattern detection is performed by Ecore2GmModel/transformations/epsilon/eol/Step1Annotation/FhirSpecificGmCoreAnnotations.eol, a specialisation of Ecore2GmModel/transformations/epsilon/eol/Step1Annotation/GenericGmCoreAnnotation.eol.

Run the case study:
1. Copy paste the Ecore2GmModel/model/fhir.ecore in Ecore2GmModel/model/annotated/ (overwrite if asked).
2. Run Ecore2GmModel/launchers/ISO20022/FHIR_Step1_Annotation.launch. Ecore2GmModel/model/annotated/fhir.ecore is annotated with GmCore.
3. Run FHIR_Step2_Java_ModelAPI_Generation.launch. Ecore2GmModel/model/annotated/fhir.ecore is converted to Java Model API for TF.
The output is generated in Ecore2GmModel/transformations/output/fhir folder. The fhir/ folder is a valid source code package that can be copied in a Tribefire Cartridge as part of Model Priming platform asset.

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FhirResourceContainer of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link account}, 
{@link activityDefinition}, 
{@link adverseEvent}, 
{@link allergyIntolerance}, 
{@link appointment}, 
{@link appointmentResponse}, 
{@link auditEvent}, 
{@link basic}, 
{@link binary}, 
{@link biologicallyDerivedProduct}, 
{@link bodyStructure}, 
{@link bundle}, 
{@link capabilityStatement}, 
{@link carePlan}, 
{@link careTeam}, 
{@link catalogEntry}, 
{@link chargeItem}, 
{@link chargeItemDefinition}, 
{@link claim}, 
{@link claimResponse}, 
{@link clinicalImpression}, 
{@link codeSystem}, 
{@link communication}, 
{@link communicationRequest}, 
{@link compartmentDefinition}, 
{@link composition}, 
{@link conceptMap}, 
{@link condition}, 
{@link consent}, 
{@link contract}, 
{@link coverage}, 
{@link coverageEligibilityRequest}, 
{@link coverageEligibilityResponse}, 
{@link detectedIssue}, 
{@link device}, 
{@link deviceDefinition}, 
{@link deviceMetric}, 
{@link deviceRequest}, 
{@link deviceUseStatement}, 
{@link diagnosticReport}, 
{@link documentManifest}, 
{@link documentReference}, 
{@link effectEvidenceSynthesis}, 
{@link encounter}, 
{@link endpoint}, 
{@link enrollmentRequest}, 
{@link enrollmentResponse}, 
{@link episodeOfCare}, 
{@link eventDefinition}, 
{@link evidence}, 
{@link evidenceVariable}, 
{@link exampleScenario}, 
{@link explanationOfBenefit}, 
{@link familyMemberHistory}, 
{@link flag}, 
{@link goal}, 
{@link graphDefinition}, 
{@link group}, 
{@link guidanceResponse}, 
{@link healthcareService}, 
{@link imagingStudy}, 
{@link immunization}, 
{@link immunizationEvaluation}, 
{@link immunizationRecommendation}, 
{@link implementationGuide}, 
{@link insurancePlan}, 
{@link invoice}, 
{@link library}, 
{@link linkage}, 
{@link list}, 
{@link location}, 
{@link measure}, 
{@link measureReport}, 
{@link media}, 
{@link medication}, 
{@link medicationAdministration}, 
{@link medicationDispense}, 
{@link medicationKnowledge}, 
{@link medicationRequest}, 
{@link medicationStatement}, 
{@link medicinalProduct}, 
{@link medicinalProductAuthorization}, 
{@link medicinalProductContraindication}, 
{@link medicinalProductIndication}, 
{@link medicinalProductIngredient}, 
{@link medicinalProductInteraction}, 
{@link medicinalProductManufactured}, 
{@link medicinalProductPackaged}, 
{@link medicinalProductPharmaceutical}, 
{@link medicinalProductUndesirableEffect}, 
{@link messageDefinition}, 
{@link messageHeader}, 
{@link molecularSequence}, 
{@link namingSystem}, 
{@link nutritionOrder}, 
{@link observation}, 
{@link observationDefinition}, 
{@link operationDefinition}, 
{@link operationOutcome}, 
{@link organization}, 
{@link organizationAffiliation}, 
{@link patient}, 
{@link paymentNotice}, 
{@link paymentReconciliation}, 
{@link person}, 
{@link planDefinition}, 
{@link practitioner}, 
{@link practitionerRole}, 
{@link procedure}, 
{@link provenance}, 
{@link questionnaire}, 
{@link questionnaireResponse}, 
{@link relatedPerson}, 
{@link requestGroup}, 
{@link researchDefinition}, 
{@link researchElementDefinition}, 
{@link researchStudy}, 
{@link researchSubject}, 
{@link riskAssessment}, 
{@link riskEvidenceSynthesis}, 
{@link schedule}, 
{@link searchParameter}, 
{@link serviceRequest}, 
{@link slot}, 
{@link specimen}, 
{@link specimenDefinition}, 
{@link structureDefinition}, 
{@link structureMap}, 
{@link subscription}, 
{@link substance}, 
{@link substanceNucleicAcid}, 
{@link substancePolymer}, 
{@link substanceProtein}, 
{@link substanceReferenceInformation}, 
{@link substanceSourceMaterial}, 
{@link substanceSpecification}, 
{@link supplyDelivery}, 
{@link supplyRequest}, 
{@link task}, 
{@link terminologyCapabilities}, 
{@link testReport}, 
{@link testScript}, 
{@link valueSet}, 
{@link verificationResult}, 
{@link visionPrescription}, 
{@link parameters}, 

* It provides of then following operations (getters and setters)
{@link getAccount},
{@link getActivityDefinition},
{@link getAdverseEvent},
{@link getAllergyIntolerance},
{@link getAppointment},
{@link getAppointmentResponse},
{@link getAuditEvent},
{@link getBasic},
{@link getBinary},
{@link getBiologicallyDerivedProduct},
{@link getBodyStructure},
{@link getBundle},
{@link getCapabilityStatement},
{@link getCarePlan},
{@link getCareTeam},
{@link getCatalogEntry},
{@link getChargeItem},
{@link getChargeItemDefinition},
{@link getClaim},
{@link getClaimResponse},
{@link getClinicalImpression},
{@link getCodeSystem},
{@link getCommunication},
{@link getCommunicationRequest},
{@link getCompartmentDefinition},
{@link getComposition},
{@link getConceptMap},
{@link getCondition},
{@link getConsent},
{@link getContract},
{@link getCoverage},
{@link getCoverageEligibilityRequest},
{@link getCoverageEligibilityResponse},
{@link getDetectedIssue},
{@link getDevice},
{@link getDeviceDefinition},
{@link getDeviceMetric},
{@link getDeviceRequest},
{@link getDeviceUseStatement},
{@link getDiagnosticReport},
{@link getDocumentManifest},
{@link getDocumentReference},
{@link getEffectEvidenceSynthesis},
{@link getEncounter},
{@link getEndpoint},
{@link getEnrollmentRequest},
{@link getEnrollmentResponse},
{@link getEpisodeOfCare},
{@link getEventDefinition},
{@link getEvidence},
{@link getEvidenceVariable},
{@link getExampleScenario},
{@link getExplanationOfBenefit},
{@link getFamilyMemberHistory},
{@link getFlag},
{@link getGoal},
{@link getGraphDefinition},
{@link getGroup},
{@link getGuidanceResponse},
{@link getHealthcareService},
{@link getImagingStudy},
{@link getImmunization},
{@link getImmunizationEvaluation},
{@link getImmunizationRecommendation},
{@link getImplementationGuide},
{@link getInsurancePlan},
{@link getInvoice},
{@link getLibrary},
{@link getLinkage},
{@link getList},
{@link getLocation},
{@link getMeasure},
{@link getMeasureReport},
{@link getMedia},
{@link getMedication},
{@link getMedicationAdministration},
{@link getMedicationDispense},
{@link getMedicationKnowledge},
{@link getMedicationRequest},
{@link getMedicationStatement},
{@link getMedicinalProduct},
{@link getMedicinalProductAuthorization},
{@link getMedicinalProductContraindication},
{@link getMedicinalProductIndication},
{@link getMedicinalProductIngredient},
{@link getMedicinalProductInteraction},
{@link getMedicinalProductManufactured},
{@link getMedicinalProductPackaged},
{@link getMedicinalProductPharmaceutical},
{@link getMedicinalProductUndesirableEffect},
{@link getMessageDefinition},
{@link getMessageHeader},
{@link getMolecularSequence},
{@link getNamingSystem},
{@link getNutritionOrder},
{@link getObservation},
{@link getObservationDefinition},
{@link getOperationDefinition},
{@link getOperationOutcome},
{@link getOrganization},
{@link getOrganizationAffiliation},
{@link getPatient},
{@link getPaymentNotice},
{@link getPaymentReconciliation},
{@link getPerson},
{@link getPlanDefinition},
{@link getPractitioner},
{@link getPractitionerRole},
{@link getProcedure},
{@link getProvenance},
{@link getQuestionnaire},
{@link getQuestionnaireResponse},
{@link getRelatedPerson},
{@link getRequestGroup},
{@link getResearchDefinition},
{@link getResearchElementDefinition},
{@link getResearchStudy},
{@link getResearchSubject},
{@link getRiskAssessment},
{@link getRiskEvidenceSynthesis},
{@link getSchedule},
{@link getSearchParameter},
{@link getServiceRequest},
{@link getSlot},
{@link getSpecimen},
{@link getSpecimenDefinition},
{@link getStructureDefinition},
{@link getStructureMap},
{@link getSubscription},
{@link getSubstance},
{@link getSubstanceNucleicAcid},
{@link getSubstancePolymer},
{@link getSubstanceProtein},
{@link getSubstanceReferenceInformation},
{@link getSubstanceSourceMaterial},
{@link getSubstanceSpecification},
{@link getSupplyDelivery},
{@link getSupplyRequest},
{@link getTask},
{@link getTerminologyCapabilities},
{@link getTestReport},
{@link getTestScript},
{@link getValueSet},
{@link getVerificationResult},
{@link getVisionPrescription},
{@link getParameters},
{@link setAccount},
{@link setActivityDefinition},
{@link setAdverseEvent},
{@link setAllergyIntolerance},
{@link setAppointment},
{@link setAppointmentResponse},
{@link setAuditEvent},
{@link setBasic},
{@link setBinary},
{@link setBiologicallyDerivedProduct},
{@link setBodyStructure},
{@link setBundle},
{@link setCapabilityStatement},
{@link setCarePlan},
{@link setCareTeam},
{@link setCatalogEntry},
{@link setChargeItem},
{@link setChargeItemDefinition},
{@link setClaim},
{@link setClaimResponse},
{@link setClinicalImpression},
{@link setCodeSystem},
{@link setCommunication},
{@link setCommunicationRequest},
{@link setCompartmentDefinition},
{@link setComposition},
{@link setConceptMap},
{@link setCondition},
{@link setConsent},
{@link setContract},
{@link setCoverage},
{@link setCoverageEligibilityRequest},
{@link setCoverageEligibilityResponse},
{@link setDetectedIssue},
{@link setDevice},
{@link setDeviceDefinition},
{@link setDeviceMetric},
{@link setDeviceRequest},
{@link setDeviceUseStatement},
{@link setDiagnosticReport},
{@link setDocumentManifest},
{@link setDocumentReference},
{@link setEffectEvidenceSynthesis},
{@link setEncounter},
{@link setEndpoint},
{@link setEnrollmentRequest},
{@link setEnrollmentResponse},
{@link setEpisodeOfCare},
{@link setEventDefinition},
{@link setEvidence},
{@link setEvidenceVariable},
{@link setExampleScenario},
{@link setExplanationOfBenefit},
{@link setFamilyMemberHistory},
{@link setFlag},
{@link setGoal},
{@link setGraphDefinition},
{@link setGroup},
{@link setGuidanceResponse},
{@link setHealthcareService},
{@link setImagingStudy},
{@link setImmunization},
{@link setImmunizationEvaluation},
{@link setImmunizationRecommendation},
{@link setImplementationGuide},
{@link setInsurancePlan},
{@link setInvoice},
{@link setLibrary},
{@link setLinkage},
{@link setList},
{@link setLocation},
{@link setMeasure},
{@link setMeasureReport},
{@link setMedia},
{@link setMedication},
{@link setMedicationAdministration},
{@link setMedicationDispense},
{@link setMedicationKnowledge},
{@link setMedicationRequest},
{@link setMedicationStatement},
{@link setMedicinalProduct},
{@link setMedicinalProductAuthorization},
{@link setMedicinalProductContraindication},
{@link setMedicinalProductIndication},
{@link setMedicinalProductIngredient},
{@link setMedicinalProductInteraction},
{@link setMedicinalProductManufactured},
{@link setMedicinalProductPackaged},
{@link setMedicinalProductPharmaceutical},
{@link setMedicinalProductUndesirableEffect},
{@link setMessageDefinition},
{@link setMessageHeader},
{@link setMolecularSequence},
{@link setNamingSystem},
{@link setNutritionOrder},
{@link setObservation},
{@link setObservationDefinition},
{@link setOperationDefinition},
{@link setOperationOutcome},
{@link setOrganization},
{@link setOrganizationAffiliation},
{@link setPatient},
{@link setPaymentNotice},
{@link setPaymentReconciliation},
{@link setPerson},
{@link setPlanDefinition},
{@link setPractitioner},
{@link setPractitionerRole},
{@link setProcedure},
{@link setProvenance},
{@link setQuestionnaire},
{@link setQuestionnaireResponse},
{@link setRelatedPerson},
{@link setRequestGroup},
{@link setResearchDefinition},
{@link setResearchElementDefinition},
{@link setResearchStudy},
{@link setResearchSubject},
{@link setRiskAssessment},
{@link setRiskEvidenceSynthesis},
{@link setSchedule},
{@link setSearchParameter},
{@link setServiceRequest},
{@link setSlot},
{@link setSpecimen},
{@link setSpecimenDefinition},
{@link setStructureDefinition},
{@link setStructureMap},
{@link setSubscription},
{@link setSubstance},
{@link setSubstanceNucleicAcid},
{@link setSubstancePolymer},
{@link setSubstanceProtein},
{@link setSubstanceReferenceInformation},
{@link setSubstanceSourceMaterial},
{@link setSubstanceSpecification},
{@link setSupplyDelivery},
{@link setSupplyRequest},
{@link setTask},
{@link setTerminologyCapabilities},
{@link setTestReport},
{@link setTestScript},
{@link setValueSet},
{@link setVerificationResult},
{@link setVisionPrescription},
{@link setParameters},
 */

@Description("")

public interface FhirResourceContainer extends GenericEntity {

	EntityType<FhirResourceContainer> T = EntityTypes.T(FhirResourceContainer.class);

	/* Constants for each property name. */
	java.lang.String account = "account";
	java.lang.String activityDefinition = "activityDefinition";
	java.lang.String adverseEvent = "adverseEvent";
	java.lang.String allergyIntolerance = "allergyIntolerance";
	java.lang.String appointment = "appointment";
	java.lang.String appointmentResponse = "appointmentResponse";
	java.lang.String auditEvent = "auditEvent";
	java.lang.String basic = "basic";
	java.lang.String binary = "binary";
	java.lang.String biologicallyDerivedProduct = "biologicallyDerivedProduct";
	java.lang.String bodyStructure = "bodyStructure";
	java.lang.String bundle = "bundle";
	java.lang.String capabilityStatement = "capabilityStatement";
	java.lang.String carePlan = "carePlan";
	java.lang.String careTeam = "careTeam";
	java.lang.String catalogEntry = "catalogEntry";
	java.lang.String chargeItem = "chargeItem";
	java.lang.String chargeItemDefinition = "chargeItemDefinition";
	java.lang.String claim = "claim";
	java.lang.String claimResponse = "claimResponse";
	java.lang.String clinicalImpression = "clinicalImpression";
	java.lang.String codeSystem = "codeSystem";
	java.lang.String communication = "communication";
	java.lang.String communicationRequest = "communicationRequest";
	java.lang.String compartmentDefinition = "compartmentDefinition";
	java.lang.String composition = "composition";
	java.lang.String conceptMap = "conceptMap";
	java.lang.String condition = "condition";
	java.lang.String consent = "consent";
	java.lang.String contract = "contract";
	java.lang.String coverage = "coverage";
	java.lang.String coverageEligibilityRequest = "coverageEligibilityRequest";
	java.lang.String coverageEligibilityResponse = "coverageEligibilityResponse";
	java.lang.String detectedIssue = "detectedIssue";
	java.lang.String device = "device";
	java.lang.String deviceDefinition = "deviceDefinition";
	java.lang.String deviceMetric = "deviceMetric";
	java.lang.String deviceRequest = "deviceRequest";
	java.lang.String deviceUseStatement = "deviceUseStatement";
	java.lang.String diagnosticReport = "diagnosticReport";
	java.lang.String documentManifest = "documentManifest";
	java.lang.String documentReference = "documentReference";
	java.lang.String effectEvidenceSynthesis = "effectEvidenceSynthesis";
	java.lang.String encounter = "encounter";
	java.lang.String endpoint = "endpoint";
	java.lang.String enrollmentRequest = "enrollmentRequest";
	java.lang.String enrollmentResponse = "enrollmentResponse";
	java.lang.String episodeOfCare = "episodeOfCare";
	java.lang.String eventDefinition = "eventDefinition";
	java.lang.String evidence = "evidence";
	java.lang.String evidenceVariable = "evidenceVariable";
	java.lang.String exampleScenario = "exampleScenario";
	java.lang.String explanationOfBenefit = "explanationOfBenefit";
	java.lang.String familyMemberHistory = "familyMemberHistory";
	java.lang.String flag = "flag";
	java.lang.String goal = "goal";
	java.lang.String graphDefinition = "graphDefinition";
	java.lang.String group = "group";
	java.lang.String guidanceResponse = "guidanceResponse";
	java.lang.String healthcareService = "healthcareService";
	java.lang.String imagingStudy = "imagingStudy";
	java.lang.String immunization = "immunization";
	java.lang.String immunizationEvaluation = "immunizationEvaluation";
	java.lang.String immunizationRecommendation = "immunizationRecommendation";
	java.lang.String implementationGuide = "implementationGuide";
	java.lang.String insurancePlan = "insurancePlan";
	java.lang.String invoice = "invoice";
	java.lang.String library = "library";
	java.lang.String linkage = "linkage";
	java.lang.String list = "list";
	java.lang.String location = "location";
	java.lang.String measure = "measure";
	java.lang.String measureReport = "measureReport";
	java.lang.String media = "media";
	java.lang.String medication = "medication";
	java.lang.String medicationAdministration = "medicationAdministration";
	java.lang.String medicationDispense = "medicationDispense";
	java.lang.String medicationKnowledge = "medicationKnowledge";
	java.lang.String medicationRequest = "medicationRequest";
	java.lang.String medicationStatement = "medicationStatement";
	java.lang.String medicinalProduct = "medicinalProduct";
	java.lang.String medicinalProductAuthorization = "medicinalProductAuthorization";
	java.lang.String medicinalProductContraindication = "medicinalProductContraindication";
	java.lang.String medicinalProductIndication = "medicinalProductIndication";
	java.lang.String medicinalProductIngredient = "medicinalProductIngredient";
	java.lang.String medicinalProductInteraction = "medicinalProductInteraction";
	java.lang.String medicinalProductManufactured = "medicinalProductManufactured";
	java.lang.String medicinalProductPackaged = "medicinalProductPackaged";
	java.lang.String medicinalProductPharmaceutical = "medicinalProductPharmaceutical";
	java.lang.String medicinalProductUndesirableEffect = "medicinalProductUndesirableEffect";
	java.lang.String messageDefinition = "messageDefinition";
	java.lang.String messageHeader = "messageHeader";
	java.lang.String molecularSequence = "molecularSequence";
	java.lang.String namingSystem = "namingSystem";
	java.lang.String nutritionOrder = "nutritionOrder";
	java.lang.String observation = "observation";
	java.lang.String observationDefinition = "observationDefinition";
	java.lang.String operationDefinition = "operationDefinition";
	java.lang.String operationOutcome = "operationOutcome";
	java.lang.String organization = "organization";
	java.lang.String organizationAffiliation = "organizationAffiliation";
	java.lang.String patient = "patient";
	java.lang.String paymentNotice = "paymentNotice";
	java.lang.String paymentReconciliation = "paymentReconciliation";
	java.lang.String person = "person";
	java.lang.String planDefinition = "planDefinition";
	java.lang.String practitioner = "practitioner";
	java.lang.String practitionerRole = "practitionerRole";
	java.lang.String procedure = "procedure";
	java.lang.String provenance = "provenance";
	java.lang.String questionnaire = "questionnaire";
	java.lang.String questionnaireResponse = "questionnaireResponse";
	java.lang.String relatedPerson = "relatedPerson";
	java.lang.String requestGroup = "requestGroup";
	java.lang.String researchDefinition = "researchDefinition";
	java.lang.String researchElementDefinition = "researchElementDefinition";
	java.lang.String researchStudy = "researchStudy";
	java.lang.String researchSubject = "researchSubject";
	java.lang.String riskAssessment = "riskAssessment";
	java.lang.String riskEvidenceSynthesis = "riskEvidenceSynthesis";
	java.lang.String schedule = "schedule";
	java.lang.String searchParameter = "searchParameter";
	java.lang.String serviceRequest = "serviceRequest";
	java.lang.String slot = "slot";
	java.lang.String specimen = "specimen";
	java.lang.String specimenDefinition = "specimenDefinition";
	java.lang.String structureDefinition = "structureDefinition";
	java.lang.String structureMap = "structureMap";
	java.lang.String subscription = "subscription";
	java.lang.String substance = "substance";
	java.lang.String substanceNucleicAcid = "substanceNucleicAcid";
	java.lang.String substancePolymer = "substancePolymer";
	java.lang.String substanceProtein = "substanceProtein";
	java.lang.String substanceReferenceInformation = "substanceReferenceInformation";
	java.lang.String substanceSourceMaterial = "substanceSourceMaterial";
	java.lang.String substanceSpecification = "substanceSpecification";
	java.lang.String supplyDelivery = "supplyDelivery";
	java.lang.String supplyRequest = "supplyRequest";
	java.lang.String task = "task";
	java.lang.String terminologyCapabilities = "terminologyCapabilities";
	java.lang.String testReport = "testReport";
	java.lang.String testScript = "testScript";
	java.lang.String valueSet = "valueSet";
	java.lang.String verificationResult = "verificationResult";
	java.lang.String visionPrescription = "visionPrescription";
	java.lang.String parameters = "parameters";

	@Description("A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.")
	@Mandatory
	fhir.Account getAccount();
	void setAccount(fhir.Account account);
	@Description("This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.")
	@Mandatory
	fhir.ActivityDefinition getActivityDefinition();
	void setActivityDefinition(fhir.ActivityDefinition activityDefinition);
	@Description("Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.")
	@Mandatory
	fhir.AdverseEvent getAdverseEvent();
	void setAdverseEvent(fhir.AdverseEvent adverseEvent);
	@Description("Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.")
	@Mandatory
	fhir.AllergyIntolerance getAllergyIntolerance();
	void setAllergyIntolerance(fhir.AllergyIntolerance allergyIntolerance);
	@Description("A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).")
	@Mandatory
	fhir.Appointment getAppointment();
	void setAppointment(fhir.Appointment appointment);
	@Description("A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.")
	@Mandatory
	fhir.AppointmentResponse getAppointmentResponse();
	void setAppointmentResponse(fhir.AppointmentResponse appointmentResponse);
	@Description("A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.")
	@Mandatory
	fhir.AuditEvent getAuditEvent();
	void setAuditEvent(fhir.AuditEvent auditEvent);
	@Description("Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.")
	@Mandatory
	fhir.Basic getBasic();
	void setBasic(fhir.Basic basic);
	@Description("A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.")
	@Mandatory
	fhir.Binary getBinary();
	void setBinary(fhir.Binary binary);
	@Description("A material substance originating from a biological entity intended to be transplanted or infusedinto another (possibly the same) biological entity.")
	@Mandatory
	fhir.BiologicallyDerivedProduct getBiologicallyDerivedProduct();
	void setBiologicallyDerivedProduct(fhir.BiologicallyDerivedProduct biologicallyDerivedProduct);
	@Description("Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.")
	@Mandatory
	fhir.BodyStructure getBodyStructure();
	void setBodyStructure(fhir.BodyStructure bodyStructure);
	@Description("A container for a collection of resources.")
	@Mandatory
	fhir.Bundle getBundle();
	void setBundle(fhir.Bundle bundle);
	@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")
	@Mandatory
	fhir.CapabilityStatement getCapabilityStatement();
	void setCapabilityStatement(fhir.CapabilityStatement capabilityStatement);
	@Description("Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.")
	@Mandatory
	fhir.CarePlan getCarePlan();
	void setCarePlan(fhir.CarePlan carePlan);
	@Description("The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.")
	@Mandatory
	fhir.CareTeam getCareTeam();
	void setCareTeam(fhir.CareTeam careTeam);
	@Description("Catalog entries are wrappers that contextualize items included in a catalog.")
	@Mandatory
	fhir.CatalogEntry getCatalogEntry();
	void setCatalogEntry(fhir.CatalogEntry catalogEntry);
	@Description("The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.")
	@Mandatory
	fhir.ChargeItem getChargeItem();
	void setChargeItem(fhir.ChargeItem chargeItem);
	@Description("The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.")
	@Mandatory
	fhir.ChargeItemDefinition getChargeItemDefinition();
	void setChargeItemDefinition(fhir.ChargeItemDefinition chargeItemDefinition);
	@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")
	@Mandatory
	fhir.Claim getClaim();
	void setClaim(fhir.Claim claim);
	@Description("This resource provides the adjudication details from the processing of a Claim resource.")
	@Mandatory
	fhir.ClaimResponse getClaimResponse();
	void setClaimResponse(fhir.ClaimResponse claimResponse);
	@Description("A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called 'ClinicalImpression' rather than 'ClinicalAssessment' to avoid confusion with the recording of assessment tools such as Apgar score.")
	@Mandatory
	fhir.ClinicalImpression getClinicalImpression();
	void setClinicalImpression(fhir.ClinicalImpression clinicalImpression);
	@Description("The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.")
	@Mandatory
	fhir.CodeSystem getCodeSystem();
	void setCodeSystem(fhir.CodeSystem codeSystem);
	@Description("An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.")
	@Mandatory
	fhir.Communication getCommunication();
	void setCommunication(fhir.Communication communication);
	@Description("A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.")
	@Mandatory
	fhir.CommunicationRequest getCommunicationRequest();
	void setCommunicationRequest(fhir.CommunicationRequest communicationRequest);
	@Description("A compartment definition that defines how resources are accessed on a server.")
	@Mandatory
	fhir.CompartmentDefinition getCompartmentDefinition();
	void setCompartmentDefinition(fhir.CompartmentDefinition compartmentDefinition);
	@Description("A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).")
	@Mandatory
	fhir.Composition getComposition();
	void setComposition(fhir.Composition composition);
	@Description("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.")
	@Mandatory
	fhir.ConceptMap getConceptMap();
	void setConceptMap(fhir.ConceptMap conceptMap);
	@Description("A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.")
	@Mandatory
	fhir.Condition getCondition();
	void setCondition(fhir.Condition condition);
	@Description("A record of a healthcare consumer?s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.")
	@Mandatory
	fhir.Consent getConsent();
	void setConsent(fhir.Consent consent);
	@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")
	@Mandatory
	fhir.Contract getContract();
	void setContract(fhir.Contract contract);
	@Description("Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.")
	@Mandatory
	fhir.Coverage getCoverage();
	void setCoverage(fhir.Coverage coverage);
	@Description("The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.")
	@Mandatory
	fhir.CoverageEligibilityRequest getCoverageEligibilityRequest();
	void setCoverageEligibilityRequest(fhir.CoverageEligibilityRequest coverageEligibilityRequest);
	@Description("This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.")
	@Mandatory
	fhir.CoverageEligibilityResponse getCoverageEligibilityResponse();
	void setCoverageEligibilityResponse(fhir.CoverageEligibilityResponse coverageEligibilityResponse);
	@Description("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.")
	@Mandatory
	fhir.DetectedIssue getDetectedIssue();
	void setDetectedIssue(fhir.DetectedIssue detectedIssue);
	@Description("A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.")
	@Mandatory
	fhir.Device getDevice();
	void setDevice(fhir.Device device);
	@Description("The characteristics, operational status and capabilities of a medical-related component of a medical device.")
	@Mandatory
	fhir.DeviceDefinition getDeviceDefinition();
	void setDeviceDefinition(fhir.DeviceDefinition deviceDefinition);
	@Description("Describes a measurement, calculation or setting capability of a medical device.")
	@Mandatory
	fhir.DeviceMetric getDeviceMetric();
	void setDeviceMetric(fhir.DeviceMetric deviceMetric);
	@Description("Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.")
	@Mandatory
	fhir.DeviceRequest getDeviceRequest();
	void setDeviceRequest(fhir.DeviceRequest deviceRequest);
	@Description("A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.")
	@Mandatory
	fhir.DeviceUseStatement getDeviceUseStatement();
	void setDeviceUseStatement(fhir.DeviceUseStatement deviceUseStatement);
	@Description("The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.")
	@Mandatory
	fhir.DiagnosticReport getDiagnosticReport();
	void setDiagnosticReport(fhir.DiagnosticReport diagnosticReport);
	@Description("A collection of documents compiled for a purpose together with metadata that applies to the collection.")
	@Mandatory
	fhir.DocumentManifest getDocumentManifest();
	void setDocumentManifest(fhir.DocumentManifest documentManifest);
	@Description("A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.")
	@Mandatory
	fhir.DocumentReference getDocumentReference();
	void setDocumentReference(fhir.DocumentReference documentReference);
	@Description("The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.")
	@Mandatory
	fhir.EffectEvidenceSynthesis getEffectEvidenceSynthesis();
	void setEffectEvidenceSynthesis(fhir.EffectEvidenceSynthesis effectEvidenceSynthesis);
	@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")
	@Mandatory
	fhir.Encounter getEncounter();
	void setEncounter(fhir.Encounter encounter);
	@Description("The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.")
	@Mandatory
	fhir.Endpoint getEndpoint();
	void setEndpoint(fhir.Endpoint endpoint);
	@Description("This resource provides the insurance enrollment details to the insurer regarding a specified coverage.")
	@Mandatory
	fhir.EnrollmentRequest getEnrollmentRequest();
	void setEnrollmentRequest(fhir.EnrollmentRequest enrollmentRequest);
	@Description("This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.")
	@Mandatory
	fhir.EnrollmentResponse getEnrollmentResponse();
	void setEnrollmentResponse(fhir.EnrollmentResponse enrollmentResponse);
	@Description("An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.")
	@Mandatory
	fhir.EpisodeOfCare getEpisodeOfCare();
	void setEpisodeOfCare(fhir.EpisodeOfCare episodeOfCare);
	@Description("The EventDefinition resource provides a reusable description of when a particular event can occur.")
	@Mandatory
	fhir.EventDefinition getEventDefinition();
	void setEventDefinition(fhir.EventDefinition eventDefinition);
	@Description("The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.")
	@Mandatory
	fhir.Evidence getEvidence();
	void setEvidence(fhir.Evidence evidence);
	@Description("The EvidenceVariable resource describes a 'PICO' element that knowledge (evidence, assertion, recommendation) is about.")
	@Mandatory
	fhir.EvidenceVariable getEvidenceVariable();
	void setEvidenceVariable(fhir.EvidenceVariable evidenceVariable);
	@Description("Example of workflow instance.")
	@Mandatory
	fhir.ExampleScenario getExampleScenario();
	void setExampleScenario(fhir.ExampleScenario exampleScenario);
	@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")
	@Mandatory
	fhir.ExplanationOfBenefit getExplanationOfBenefit();
	void setExplanationOfBenefit(fhir.ExplanationOfBenefit explanationOfBenefit);
	@Description("Significant health conditions for a person related to the patient relevant in the context of care for the patient.")
	@Mandatory
	fhir.FamilyMemberHistory getFamilyMemberHistory();
	void setFamilyMemberHistory(fhir.FamilyMemberHistory familyMemberHistory);
	@Description("Prospective warnings of potential issues when providing care to the patient.")
	@Mandatory
	fhir.Flag getFlag();
	void setFlag(fhir.Flag flag);
	@Description("Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.")
	@Mandatory
	fhir.Goal getGoal();
	void setGoal(fhir.Goal goal);
	@Description("A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.")
	@Mandatory
	fhir.GraphDefinition getGraphDefinition();
	void setGraphDefinition(fhir.GraphDefinition graphDefinition);
	@Description("Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.")
	@Mandatory
	fhir.Group getGroup();
	void setGroup(fhir.Group group);
	@Description("A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.")
	@Mandatory
	fhir.GuidanceResponse getGuidanceResponse();
	void setGuidanceResponse(fhir.GuidanceResponse guidanceResponse);
	@Description("The details of a healthcare service available at a location.")
	@Mandatory
	fhir.HealthcareService getHealthcareService();
	void setHealthcareService(fhir.HealthcareService healthcareService);
	@Description("Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.")
	@Mandatory
	fhir.ImagingStudy getImagingStudy();
	void setImagingStudy(fhir.ImagingStudy imagingStudy);
	@Description("Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.")
	@Mandatory
	fhir.Immunization getImmunization();
	void setImmunization(fhir.Immunization immunization);
	@Description("Describes a comparison of an immunization event against published recommendations to determine if the administration is 'valid' in relation to those  recommendations.")
	@Mandatory
	fhir.ImmunizationEvaluation getImmunizationEvaluation();
	void setImmunizationEvaluation(fhir.ImmunizationEvaluation immunizationEvaluation);
	@Description("A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.")
	@Mandatory
	fhir.ImmunizationRecommendation getImmunizationRecommendation();
	void setImmunizationRecommendation(fhir.ImmunizationRecommendation immunizationRecommendation);
	@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")
	@Mandatory
	fhir.ImplementationGuide getImplementationGuide();
	void setImplementationGuide(fhir.ImplementationGuide implementationGuide);
	@Description("Details of a Health Insurance product/plan provided by an organization.")
	@Mandatory
	fhir.InsurancePlan getInsurancePlan();
	void setInsurancePlan(fhir.InsurancePlan insurancePlan);
	@Description("Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.")
	@Mandatory
	fhir.Invoice getInvoice();
	void setInvoice(fhir.Invoice invoice);
	@Description("The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.")
	@Mandatory
	fhir.Library getLibrary();
	void setLibrary(fhir.Library library);
	@Description("Identifies two or more records (resource instances) that refer to the same real-world 'occurrence'.")
	@Mandatory
	fhir.Linkage getLinkage();
	void setLinkage(fhir.Linkage linkage);
	@Description("A list is a curated collection of resources.")
	@Mandatory
	fhir.List getList();
	void setList(fhir.List list);
	@Description("Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.")
	@Mandatory
	fhir.Location getLocation();
	void setLocation(fhir.Location location);
	@Description("The Measure resource provides the definition of a quality measure.")
	@Mandatory
	fhir.Measure getMeasure();
	void setMeasure(fhir.Measure measure);
	@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")
	@Mandatory
	fhir.MeasureReport getMeasureReport();
	void setMeasureReport(fhir.MeasureReport measureReport);
	@Description("A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.")
	@Mandatory
	fhir.Media getMedia();
	void setMedia(fhir.Media media);
	@Description("This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.")
	@Mandatory
	fhir.Medication getMedication();
	void setMedication(fhir.Medication medication);
	@Description("Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.")
	@Mandatory
	fhir.MedicationAdministration getMedicationAdministration();
	void setMedicationAdministration(fhir.MedicationAdministration medicationAdministration);
	@Description("Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.")
	@Mandatory
	fhir.MedicationDispense getMedicationDispense();
	void setMedicationDispense(fhir.MedicationDispense medicationDispense);
	@Description("Information about a medication that is used to support knowledge.")
	@Mandatory
	fhir.MedicationKnowledge getMedicationKnowledge();
	void setMedicationKnowledge(fhir.MedicationKnowledge medicationKnowledge);
	@Description("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called 'MedicationRequest' rather than 'MedicationPrescription' or 'MedicationOrder' to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")
	@Mandatory
	fhir.MedicationRequest getMedicationRequest();
	void setMedicationRequest(fhir.MedicationRequest medicationRequest);
	@Description("A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.")
	@Mandatory
	fhir.MedicationStatement getMedicationStatement();
	void setMedicationStatement(fhir.MedicationStatement medicationStatement);
	@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).")
	@Mandatory
	fhir.MedicinalProduct getMedicinalProduct();
	void setMedicinalProduct(fhir.MedicinalProduct medicinalProduct);
	@Description("The regulatory authorization of a medicinal product.")
	@Mandatory
	fhir.MedicinalProductAuthorization getMedicinalProductAuthorization();
	void setMedicinalProductAuthorization(fhir.MedicinalProductAuthorization medicinalProductAuthorization);
	@Description("The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.")
	@Mandatory
	fhir.MedicinalProductContraindication getMedicinalProductContraindication();
	void setMedicinalProductContraindication(fhir.MedicinalProductContraindication medicinalProductContraindication);
	@Description("Indication for the Medicinal Product.")
	@Mandatory
	fhir.MedicinalProductIndication getMedicinalProductIndication();
	void setMedicinalProductIndication(fhir.MedicinalProductIndication medicinalProductIndication);
	@Description("An ingredient of a manufactured item or pharmaceutical product.")
	@Mandatory
	fhir.MedicinalProductIngredient getMedicinalProductIngredient();
	void setMedicinalProductIngredient(fhir.MedicinalProductIngredient medicinalProductIngredient);
	@Description("The interactions of the medicinal product with other medicinal products, or other forms of interactions.")
	@Mandatory
	fhir.MedicinalProductInteraction getMedicinalProductInteraction();
	void setMedicinalProductInteraction(fhir.MedicinalProductInteraction medicinalProductInteraction);
	@Description("The manufactured item as contained in the packaged medicinal product.")
	@Mandatory
	fhir.MedicinalProductManufactured getMedicinalProductManufactured();
	void setMedicinalProductManufactured(fhir.MedicinalProductManufactured medicinalProductManufactured);
	@Description("A medicinal product in a container or package.")
	@Mandatory
	fhir.MedicinalProductPackaged getMedicinalProductPackaged();
	void setMedicinalProductPackaged(fhir.MedicinalProductPackaged medicinalProductPackaged);
	@Description("A pharmaceutical product described in terms of its composition and dose form.")
	@Mandatory
	fhir.MedicinalProductPharmaceutical getMedicinalProductPharmaceutical();
	void setMedicinalProductPharmaceutical(fhir.MedicinalProductPharmaceutical medicinalProductPharmaceutical);
	@Description("Describe the undesirable effects of the medicinal product.")
	@Mandatory
	fhir.MedicinalProductUndesirableEffect getMedicinalProductUndesirableEffect();
	void setMedicinalProductUndesirableEffect(fhir.MedicinalProductUndesirableEffect medicinalProductUndesirableEffect);
	@Description("Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.")
	@Mandatory
	fhir.MessageDefinition getMessageDefinition();
	void setMessageDefinition(fhir.MessageDefinition messageDefinition);
	@Description("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.")
	@Mandatory
	fhir.MessageHeader getMessageHeader();
	void setMessageHeader(fhir.MessageHeader messageHeader);
	@Description("Raw data describing a biological sequence.")
	@Mandatory
	fhir.MolecularSequence getMolecularSequence();
	void setMolecularSequence(fhir.MolecularSequence molecularSequence);
	@Description("A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a 'System' used within the Identifier and Coding data types.")
	@Mandatory
	fhir.NamingSystem getNamingSystem();
	void setNamingSystem(fhir.NamingSystem namingSystem);
	@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")
	@Mandatory
	fhir.NutritionOrder getNutritionOrder();
	void setNutritionOrder(fhir.NutritionOrder nutritionOrder);
	@Description("Measurements and simple assertions made about a patient, device or other subject.")
	@Mandatory
	fhir.Observation getObservation();
	void setObservation(fhir.Observation observation);
	@Description("Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.")
	@Mandatory
	fhir.ObservationDefinition getObservationDefinition();
	void setObservationDefinition(fhir.ObservationDefinition observationDefinition);
	@Description("A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).")
	@Mandatory
	fhir.OperationDefinition getOperationDefinition();
	void setOperationDefinition(fhir.OperationDefinition operationDefinition);
	@Description("A collection of error, warning, or information messages that result from a system action.")
	@Mandatory
	fhir.OperationOutcome getOperationOutcome();
	void setOperationOutcome(fhir.OperationOutcome operationOutcome);
	@Description("A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.")
	@Mandatory
	fhir.Organization getOrganization();
	void setOrganization(fhir.Organization organization);
	@Description("Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.")
	@Mandatory
	fhir.OrganizationAffiliation getOrganizationAffiliation();
	void setOrganizationAffiliation(fhir.OrganizationAffiliation organizationAffiliation);
	@Description("Demographics and other administrative information about an individual or animal receiving care or other health-related services.")
	@Mandatory
	fhir.Patient getPatient();
	void setPatient(fhir.Patient patient);
	@Description("This resource provides the status of the payment for goods and services rendered, and the request and response resource references.")
	@Mandatory
	fhir.PaymentNotice getPaymentNotice();
	void setPaymentNotice(fhir.PaymentNotice paymentNotice);
	@Description("This resource provides the details including amount of a payment and allocates the payment items being paid.")
	@Mandatory
	fhir.PaymentReconciliation getPaymentReconciliation();
	void setPaymentReconciliation(fhir.PaymentReconciliation paymentReconciliation);
	@Description("Demographics and administrative information about a person independent of a specific health-related context.")
	@Mandatory
	fhir.Person getPerson();
	void setPerson(fhir.Person person);
	@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")
	@Mandatory
	fhir.PlanDefinition getPlanDefinition();
	void setPlanDefinition(fhir.PlanDefinition planDefinition);
	@Description("A person who is directly or indirectly involved in the provisioning of healthcare.")
	@Mandatory
	fhir.Practitioner getPractitioner();
	void setPractitioner(fhir.Practitioner practitioner);
	@Description("A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.")
	@Mandatory
	fhir.PractitionerRole getPractitionerRole();
	void setPractitionerRole(fhir.PractitionerRole practitionerRole);
	@Description("An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.")
	@Mandatory
	fhir.Procedure getProcedure();
	void setProcedure(fhir.Procedure procedure);
	@Description("Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.")
	@Mandatory
	fhir.Provenance getProvenance();
	void setProvenance(fhir.Provenance provenance);
	@Description("A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.")
	@Mandatory
	fhir.Questionnaire getQuestionnaire();
	void setQuestionnaire(fhir.Questionnaire questionnaire);
	@Description("A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.")
	@Mandatory
	fhir.QuestionnaireResponse getQuestionnaireResponse();
	void setQuestionnaireResponse(fhir.QuestionnaireResponse questionnaireResponse);
	@Description("Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.")
	@Mandatory
	fhir.RelatedPerson getRelatedPerson();
	void setRelatedPerson(fhir.RelatedPerson relatedPerson);
	@Description("A group of related requests that can be used to capture intended activities that have inter-dependencies such as 'give this medication after that one'.")
	@Mandatory
	fhir.RequestGroup getRequestGroup();
	void setRequestGroup(fhir.RequestGroup requestGroup);
	@Description("The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.")
	@Mandatory
	fhir.ResearchDefinition getResearchDefinition();
	void setResearchDefinition(fhir.ResearchDefinition researchDefinition);
	@Description("The ResearchElementDefinition resource describes a 'PICO' element that knowledge (evidence, assertion, recommendation) is about.")
	@Mandatory
	fhir.ResearchElementDefinition getResearchElementDefinition();
	void setResearchElementDefinition(fhir.ResearchElementDefinition researchElementDefinition);
	@Description("A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.")
	@Mandatory
	fhir.ResearchStudy getResearchStudy();
	void setResearchStudy(fhir.ResearchStudy researchStudy);
	@Description("A physical entity which is the primary unit of operational and/or administrative interest in a study.")
	@Mandatory
	fhir.ResearchSubject getResearchSubject();
	void setResearchSubject(fhir.ResearchSubject researchSubject);
	@Description("An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.")
	@Mandatory
	fhir.RiskAssessment getRiskAssessment();
	void setRiskAssessment(fhir.RiskAssessment riskAssessment);
	@Description("The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.")
	@Mandatory
	fhir.RiskEvidenceSynthesis getRiskEvidenceSynthesis();
	void setRiskEvidenceSynthesis(fhir.RiskEvidenceSynthesis riskEvidenceSynthesis);
	@Description("A container for slots of time that may be available for booking appointments.")
	@Mandatory
	fhir.Schedule getSchedule();
	void setSchedule(fhir.Schedule schedule);
	@Description("A search parameter that defines a named search item that can be used to search/filter on a resource.")
	@Mandatory
	fhir.SearchParameter getSearchParameter();
	void setSearchParameter(fhir.SearchParameter searchParameter);
	@Description("A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.")
	@Mandatory
	fhir.ServiceRequest getServiceRequest();
	void setServiceRequest(fhir.ServiceRequest serviceRequest);
	@Description("A slot of time on a schedule that may be available for booking appointments.")
	@Mandatory
	fhir.Slot getSlot();
	void setSlot(fhir.Slot slot);
	@Description("A sample to be used for analysis.")
	@Mandatory
	fhir.Specimen getSpecimen();
	void setSpecimen(fhir.Specimen specimen);
	@Description("A kind of specimen with associated set of requirements.")
	@Mandatory
	fhir.SpecimenDefinition getSpecimenDefinition();
	void setSpecimenDefinition(fhir.SpecimenDefinition specimenDefinition);
	@Description("A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.")
	@Mandatory
	fhir.StructureDefinition getStructureDefinition();
	void setStructureDefinition(fhir.StructureDefinition structureDefinition);
	@Description("A Map of relationships between 2 structures that can be used to transform data.")
	@Mandatory
	fhir.StructureMap getStructureMap();
	void setStructureMap(fhir.StructureMap structureMap);
	@Description("The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined 'channel' so that another system can take an appropriate action.")
	@Mandatory
	fhir.Subscription getSubscription();
	void setSubscription(fhir.Subscription subscription);
	@Description("A homogeneous material with a definite composition.")
	@Mandatory
	fhir.Substance getSubstance();
	void setSubstance(fhir.Substance substance);
	@Description("Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5?-3? direction.")
	@Mandatory
	fhir.SubstanceNucleicAcid getSubstanceNucleicAcid();
	void setSubstanceNucleicAcid(fhir.SubstanceNucleicAcid substanceNucleicAcid);
	@Description("Todo.")
	@Mandatory
	fhir.SubstancePolymer getSubstancePolymer();
	void setSubstancePolymer(fhir.SubstancePolymer substancePolymer);
	@Description("A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.")
	@Mandatory
	fhir.SubstanceProtein getSubstanceProtein();
	void setSubstanceProtein(fhir.SubstanceProtein substanceProtein);
	@Description("Todo.")
	@Mandatory
	fhir.SubstanceReferenceInformation getSubstanceReferenceInformation();
	void setSubstanceReferenceInformation(fhir.SubstanceReferenceInformation substanceReferenceInformation);
	@Description("Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.")
	@Mandatory
	fhir.SubstanceSourceMaterial getSubstanceSourceMaterial();
	void setSubstanceSourceMaterial(fhir.SubstanceSourceMaterial substanceSourceMaterial);
	@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")
	@Mandatory
	fhir.SubstanceSpecification getSubstanceSpecification();
	void setSubstanceSpecification(fhir.SubstanceSpecification substanceSpecification);
	@Description("Record of delivery of what is supplied.")
	@Mandatory
	fhir.SupplyDelivery getSupplyDelivery();
	void setSupplyDelivery(fhir.SupplyDelivery supplyDelivery);
	@Description("A record of a request for a medication, substance or device used in the healthcare setting.")
	@Mandatory
	fhir.SupplyRequest getSupplyRequest();
	void setSupplyRequest(fhir.SupplyRequest supplyRequest);
	@Description("A task to be performed.")
	@Mandatory
	fhir.Task getTask();
	void setTask(fhir.Task task);
	@Description("A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")
	@Mandatory
	fhir.TerminologyCapabilities getTerminologyCapabilities();
	void setTerminologyCapabilities(fhir.TerminologyCapabilities terminologyCapabilities);
	@Description("A summary of information based on the results of executing a TestScript.")
	@Mandatory
	fhir.TestReport getTestReport();
	void setTestReport(fhir.TestReport testReport);
	@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")
	@Mandatory
	fhir.TestScript getTestScript();
	void setTestScript(fhir.TestScript testScript);
	@Description("A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).")
	@Mandatory
	fhir.ValueSet getValueSet();
	void setValueSet(fhir.ValueSet valueSet);
	@Description("Describes validation requirements, source(s), status and dates for one or more elements.")
	@Mandatory
	fhir.VerificationResult getVerificationResult();
	void setVerificationResult(fhir.VerificationResult verificationResult);
	@Description("An authorization for the provision of glasses and/or contact lenses to a patient.")
	@Mandatory
	fhir.VisionPrescription getVisionPrescription();
	void setVisionPrescription(fhir.VisionPrescription visionPrescription);
	@Description("This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.")
	@Mandatory
	fhir.Parameters getParameters();
	void setParameters(fhir.Parameters parameters);
}

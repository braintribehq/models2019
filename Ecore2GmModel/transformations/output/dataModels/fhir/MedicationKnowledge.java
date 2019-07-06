/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledge of the Data Model fhir.
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
{@link code}, 
{@link manufacturer}, 
{@link doseForm}, 
{@link amount}, 
{@link relatedMedicationKnowledge}, 
{@link associatedMedication}, 
{@link productType}, 
{@link monograph}, 
{@link ingredient}, 
{@link intendedRoute}, 
{@link cost}, 
{@link monitoringProgram}, 
{@link administrationGuidelines}, 
{@link medicineClassification}, 
{@link packaging}, 
{@link drugCharacteristic}, 
{@link contraindication}, 
{@link regulatory}, 
{@link kinetics}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getManufacturer},
{@link getDoseForm},
{@link getAmount},
{@link getRelatedMedicationKnowledge},
{@link getAssociatedMedication},
{@link getProductType},
{@link getMonograph},
{@link getIngredient},
{@link getIntendedRoute},
{@link getCost},
{@link getMonitoringProgram},
{@link getAdministrationGuidelines},
{@link getMedicineClassification},
{@link getPackaging},
{@link getDrugCharacteristic},
{@link getContraindication},
{@link getRegulatory},
{@link getKinetics},
{@link setCode},
{@link setManufacturer},
{@link setDoseForm},
{@link setAmount},
{@link setRelatedMedicationKnowledge},
{@link setAssociatedMedication},
{@link setProductType},
{@link setMonograph},
{@link setIngredient},
{@link setIntendedRoute},
{@link setCost},
{@link setMonitoringProgram},
{@link setAdministrationGuidelines},
{@link setMedicineClassification},
{@link setPackaging},
{@link setDrugCharacteristic},
{@link setContraindication},
{@link setRegulatory},
{@link setKinetics},
 */

@Description("Information about a medication that is used to support knowledge.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicationKnowledge extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicationKnowledge> T = EntityTypes.T(MedicationKnowledge.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String doseForm = "doseForm";
	java.lang.String amount = "amount";
	java.lang.String relatedMedicationKnowledge = "relatedMedicationKnowledge";
	java.lang.String associatedMedication = "associatedMedication";
	java.lang.String productType = "productType";
	java.lang.String monograph = "monograph";
	java.lang.String ingredient = "ingredient";
	java.lang.String intendedRoute = "intendedRoute";
	java.lang.String cost = "cost";
	java.lang.String monitoringProgram = "monitoringProgram";
	java.lang.String administrationGuidelines = "administrationGuidelines";
	java.lang.String medicineClassification = "medicineClassification";
	java.lang.String packaging = "packaging";
	java.lang.String drugCharacteristic = "drugCharacteristic";
	java.lang.String contraindication = "contraindication";
	java.lang.String regulatory = "regulatory";
	java.lang.String kinetics = "kinetics";

	@Description("A code that specifies this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManufacturer();
	void setManufacturer(com.braintribe.model.generic.GenericEntity manufacturer);
	@Description("Describes the form of the item.  Powder; tablets; capsule.")
	@Mandatory
	fhir.CodeableConcept getDoseForm();
	void setDoseForm(fhir.CodeableConcept doseForm);
	@Description("Specific amount of the drug in the packaged product.  For example, when specifying a product that has the same strength (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of the package amount (For example, 3 mL, 10mL, etc.).")
	@Mandatory
	fhir.Quantity getAmount();
	void setAmount(fhir.Quantity amount);
	@Description("Associated or related knowledge about a medication.")
	
	java.util.List<fhir.MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge();
	void setRelatedMedicationKnowledge(java.util.List<fhir.MedicationKnowledgeRelatedMedicationKnowledge> relatedMedicationKnowledge);

	@Description("Associated or related medications.  For example, if the medication is a branded product (e.g. Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAssociatedMedication();
	void setAssociatedMedication(java.util.List<com.braintribe.model.generic.GenericEntity> associatedMedication);

	@Description("Category of the medication or product (e.g. branded product, therapeutic moeity, generic product, innovator product, etc.).")
	
	java.util.List<fhir.CodeableConcept> getProductType();
	void setProductType(java.util.List<fhir.CodeableConcept> productType);

	@Description("Associated documentation about the medication.")
	
	java.util.List<fhir.MedicationKnowledgeMonograph> getMonograph();
	void setMonograph(java.util.List<fhir.MedicationKnowledgeMonograph> monograph);

	@Description("Identifies a particular constituent of interest in the product.")
	
	java.util.List<fhir.MedicationKnowledgeIngredient> getIngredient();
	void setIngredient(java.util.List<fhir.MedicationKnowledgeIngredient> ingredient);

	@Description("The intended or approved route of administration.")
	
	java.util.List<fhir.CodeableConcept> getIntendedRoute();
	void setIntendedRoute(java.util.List<fhir.CodeableConcept> intendedRoute);

	@Description("The price of the medication.")
	
	java.util.List<fhir.MedicationKnowledgeCost> getCost();
	void setCost(java.util.List<fhir.MedicationKnowledgeCost> cost);

	@Description("The program under which the medication is reviewed.")
	
	java.util.List<fhir.MedicationKnowledgeMonitoringProgram> getMonitoringProgram();
	void setMonitoringProgram(java.util.List<fhir.MedicationKnowledgeMonitoringProgram> monitoringProgram);

	@Description("Guidelines for the administration of the medication.")
	
	java.util.List<fhir.MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines();
	void setAdministrationGuidelines(java.util.List<fhir.MedicationKnowledgeAdministrationGuidelines> administrationGuidelines);

	@Description("Categorization of the medication within a formulary or classification system.")
	
	java.util.List<fhir.MedicationKnowledgeMedicineClassification> getMedicineClassification();
	void setMedicineClassification(java.util.List<fhir.MedicationKnowledgeMedicineClassification> medicineClassification);

	@Description("Information that only applies to packages (not products).")
	@Mandatory
	fhir.MedicationKnowledgePackaging getPackaging();
	void setPackaging(fhir.MedicationKnowledgePackaging packaging);
	@Description("Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.")
	
	java.util.List<fhir.MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic();
	void setDrugCharacteristic(java.util.List<fhir.MedicationKnowledgeDrugCharacteristic> drugCharacteristic);

	@Description("Potential clinical issue with or between medication(s) (for example, drug-drug interaction, drug-disease contraindication, drug-allergy interaction, etc.).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContraindication();
	void setContraindication(java.util.List<com.braintribe.model.generic.GenericEntity> contraindication);

	@Description("Regulatory information about a medication.")
	
	java.util.List<fhir.MedicationKnowledgeRegulatory> getRegulatory();
	void setRegulatory(java.util.List<fhir.MedicationKnowledgeRegulatory> regulatory);

	@Description("The time course of drug absorption, distribution, metabolism and excretion of a medication from the body.")
	
	java.util.List<fhir.MedicationKnowledgeKinetics> getKinetics();
	void setKinetics(java.util.List<fhir.MedicationKnowledgeKinetics> kinetics);

}

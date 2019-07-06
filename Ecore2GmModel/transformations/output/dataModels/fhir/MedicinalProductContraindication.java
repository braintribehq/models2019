/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductContraindication of the Data Model fhir.
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
{@link subject}, 
{@link disease}, 
{@link diseaseStatus}, 
{@link comorbidity}, 
{@link therapeuticIndication}, 
{@link otherTherapy}, 
{@link population}, 

* It provides of then following operations (getters and setters)
{@link getSubject},
{@link getDisease},
{@link getDiseaseStatus},
{@link getComorbidity},
{@link getTherapeuticIndication},
{@link getOtherTherapy},
{@link getPopulation},
{@link setSubject},
{@link setDisease},
{@link setDiseaseStatus},
{@link setComorbidity},
{@link setTherapeuticIndication},
{@link setOtherTherapy},
{@link setPopulation},
 */

@Description("The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductContraindication extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductContraindication> T = EntityTypes.T(MedicinalProductContraindication.class);

	/* Constants for each property name. */
	java.lang.String subject = "subject";
	java.lang.String disease = "disease";
	java.lang.String diseaseStatus = "diseaseStatus";
	java.lang.String comorbidity = "comorbidity";
	java.lang.String therapeuticIndication = "therapeuticIndication";
	java.lang.String otherTherapy = "otherTherapy";
	java.lang.String population = "population";

	@Description("The medication for which this is an indication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The disease, symptom or procedure for the contraindication.")
	@Mandatory
	fhir.CodeableConcept getDisease();
	void setDisease(fhir.CodeableConcept disease);
	@Description("The status of the disease or symptom for the contraindication.")
	@Mandatory
	fhir.CodeableConcept getDiseaseStatus();
	void setDiseaseStatus(fhir.CodeableConcept diseaseStatus);
	@Description("A comorbidity (concurrent condition) or coinfection.")
	
	java.util.List<fhir.CodeableConcept> getComorbidity();
	void setComorbidity(java.util.List<fhir.CodeableConcept> comorbidity);

	@Description("Information about the use of the medicinal product in relation to other therapies as part of the indication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getTherapeuticIndication();
	void setTherapeuticIndication(java.util.List<com.braintribe.model.generic.GenericEntity> therapeuticIndication);

	@Description("Information about the use of the medicinal product in relation to other therapies described as part of the indication.")
	
	java.util.List<fhir.MedicinalProductContraindicationOtherTherapy> getOtherTherapy();
	void setOtherTherapy(java.util.List<fhir.MedicinalProductContraindicationOtherTherapy> otherTherapy);

	@Description("The population group to which this applies.")
	
	java.util.List<fhir.Population> getPopulation();
	void setPopulation(java.util.List<fhir.Population> population);

}

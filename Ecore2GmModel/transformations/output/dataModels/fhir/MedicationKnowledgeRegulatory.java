/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeRegulatory of the Data Model fhir.
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
{@link regulatoryAuthority}, 
{@link substitution}, 
{@link schedule}, 
{@link maxDispense}, 

* It provides of then following operations (getters and setters)
{@link getRegulatoryAuthority},
{@link getSubstitution},
{@link getSchedule},
{@link getMaxDispense},
{@link setRegulatoryAuthority},
{@link setSubstitution},
{@link setSchedule},
{@link setMaxDispense},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeRegulatory extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeRegulatory> T = EntityTypes.T(MedicationKnowledgeRegulatory.class);

	/* Constants for each property name. */
	java.lang.String regulatoryAuthority = "regulatoryAuthority";
	java.lang.String substitution = "substitution";
	java.lang.String schedule = "schedule";
	java.lang.String maxDispense = "maxDispense";

	@Description("The authority that is specifying the regulations.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRegulatoryAuthority();
	void setRegulatoryAuthority(com.braintribe.model.generic.GenericEntity regulatoryAuthority);
	@Description("Specifies if changes are allowed when dispensing a medication from a regulatory perspective.")
	
	java.util.List<fhir.MedicationKnowledgeSubstitution> getSubstitution();
	void setSubstitution(java.util.List<fhir.MedicationKnowledgeSubstitution> substitution);

	@Description("Specifies the schedule of a medication in jurisdiction.")
	
	java.util.List<fhir.MedicationKnowledgeSchedule> getSchedule();
	void setSchedule(java.util.List<fhir.MedicationKnowledgeSchedule> schedule);

	@Description("The maximum number of units of the medication that can be dispensed in a period.")
	@Mandatory
	fhir.MedicationKnowledgeMaxDispense getMaxDispense();
	void setMaxDispense(fhir.MedicationKnowledgeMaxDispense maxDispense);
}

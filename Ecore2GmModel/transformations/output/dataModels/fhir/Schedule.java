/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Schedule of the Data Model fhir.
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
{@link identifier}, 
{@link serviceCategory}, 
{@link serviceType}, 
{@link specialty}, 
{@link actor}, 
{@link planningHorizon}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getServiceCategory},
{@link getServiceType},
{@link getSpecialty},
{@link getActor},
{@link getPlanningHorizon},
{@link setIdentifier},
{@link setServiceCategory},
{@link setServiceType},
{@link setSpecialty},
{@link setActor},
{@link setPlanningHorizon},
 */

@Description("A container for slots of time that may be available for booking appointments.If the element is present, it must have either a @value, an @id, or extensions")

public interface Schedule extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Schedule> T = EntityTypes.T(Schedule.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String serviceCategory = "serviceCategory";
	java.lang.String serviceType = "serviceType";
	java.lang.String specialty = "specialty";
	java.lang.String actor = "actor";
	java.lang.String planningHorizon = "planningHorizon";

	@Description("External Ids for this item.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A broad categorization of the service that is to be performed during this appointment.")
	
	java.util.List<fhir.CodeableConcept> getServiceCategory();
	void setServiceCategory(java.util.List<fhir.CodeableConcept> serviceCategory);

	@Description("The specific service that is to be performed during this appointment.")
	
	java.util.List<fhir.CodeableConcept> getServiceType();
	void setServiceType(java.util.List<fhir.CodeableConcept> serviceType);

	@Description("The specialty of a practitioner that would be required to perform the service requested in this appointment.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("Slots that reference this schedule resource provide the availability details to these referenced resource(s).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getActor();
	void setActor(java.util.List<com.braintribe.model.generic.GenericEntity> actor);

	@Description("The period of time that the slots that reference this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a 'template' for planning outside these dates.")
	@Mandatory
	fhir.Period getPlanningHorizon();
	void setPlanningHorizon(fhir.Period planningHorizon);
}

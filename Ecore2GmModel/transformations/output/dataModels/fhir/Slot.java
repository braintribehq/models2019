/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Slot of the Data Model fhir.
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
{@link appointmentType}, 
{@link schedule}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getServiceCategory},
{@link getServiceType},
{@link getSpecialty},
{@link getAppointmentType},
{@link getSchedule},
{@link setIdentifier},
{@link setServiceCategory},
{@link setServiceType},
{@link setSpecialty},
{@link setAppointmentType},
{@link setSchedule},
 */

@Description("A slot of time on a schedule that may be available for booking appointments.If the element is present, it must have either a @value, an @id, or extensions")

public interface Slot extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Slot> T = EntityTypes.T(Slot.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String serviceCategory = "serviceCategory";
	java.lang.String serviceType = "serviceType";
	java.lang.String specialty = "specialty";
	java.lang.String appointmentType = "appointmentType";
	java.lang.String schedule = "schedule";

	@Description("External Ids for this item.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A broad categorization of the service that is to be performed during this appointment.")
	
	java.util.List<fhir.CodeableConcept> getServiceCategory();
	void setServiceCategory(java.util.List<fhir.CodeableConcept> serviceCategory);

	@Description("The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.")
	
	java.util.List<fhir.CodeableConcept> getServiceType();
	void setServiceType(java.util.List<fhir.CodeableConcept> serviceType);

	@Description("The specialty of a practitioner that would be required to perform the service requested in this appointment.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("The style of appointment or patient that may be booked in the slot (not service type).")
	@Mandatory
	fhir.CodeableConcept getAppointmentType();
	void setAppointmentType(fhir.CodeableConcept appointmentType);
	@Description("The schedule resource that this slot defines an interval of status information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSchedule();
	void setSchedule(com.braintribe.model.generic.GenericEntity schedule);
}

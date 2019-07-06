/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Location of the Data Model fhir.
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
{@link operationalStatus}, 
{@link type}, 
{@link telecom}, 
{@link address}, 
{@link physicalType}, 
{@link position}, 
{@link managingOrganization}, 
{@link partOf}, 
{@link hoursOfOperation}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getOperationalStatus},
{@link getType},
{@link getTelecom},
{@link getAddress},
{@link getPhysicalType},
{@link getPosition},
{@link getManagingOrganization},
{@link getPartOf},
{@link getHoursOfOperation},
{@link getEndpoint},
{@link setIdentifier},
{@link setOperationalStatus},
{@link setType},
{@link setTelecom},
{@link setAddress},
{@link setPhysicalType},
{@link setPosition},
{@link setManagingOrganization},
{@link setPartOf},
{@link setHoursOfOperation},
{@link setEndpoint},
 */

@Description("Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.If the element is present, it must have either a @value, an @id, or extensions")

public interface Location extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Location> T = EntityTypes.T(Location.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String operationalStatus = "operationalStatus";
	java.lang.String type = "type";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String physicalType = "physicalType";
	java.lang.String position = "position";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String partOf = "partOf";
	java.lang.String hoursOfOperation = "hoursOfOperation";
	java.lang.String endpoint = "endpoint";

	@Description("Unique code or number identifying the location to its users.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The operational status covers operation values most relevant to beds (but can also apply to rooms/units/chairs/etc. such as an isolation unit/dialysis chair). This typically covers concepts such as contamination, housekeeping, and other activities like maintenance.")
	@Mandatory
	fhir.Coding getOperationalStatus();
	void setOperationalStatus(fhir.Coding operationalStatus);
	@Description("Indicates the type of function performed at the location.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Physical location.")
	@Mandatory
	fhir.Address getAddress();
	void setAddress(fhir.Address address);
	@Description("Physical form of the location, e.g. building, room, vehicle, road.")
	@Mandatory
	fhir.CodeableConcept getPhysicalType();
	void setPhysicalType(fhir.CodeableConcept physicalType);
	@Description("The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).")
	@Mandatory
	fhir.LocationPosition getPosition();
	void setPosition(fhir.LocationPosition position);
	@Description("The organization responsible for the provisioning and upkeep of the location.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingOrganization();
	void setManagingOrganization(com.braintribe.model.generic.GenericEntity managingOrganization);
	@Description("Another Location of which this Location is physically a part of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPartOf();
	void setPartOf(com.braintribe.model.generic.GenericEntity partOf);
	@Description("What days/times during a week is this location usually open.")
	
	java.util.List<fhir.LocationHoursOfOperation> getHoursOfOperation();
	void setHoursOfOperation(java.util.List<fhir.LocationHoursOfOperation> hoursOfOperation);

	@Description("Technical endpoints providing access to services operated for the location.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

}

/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Group of the Data Model fhir.
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
{@link code}, 
{@link managingEntity}, 
{@link characteristic}, 
{@link member}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCode},
{@link getManagingEntity},
{@link getCharacteristic},
{@link getMember},
{@link setIdentifier},
{@link setCode},
{@link setManagingEntity},
{@link setCharacteristic},
{@link setMember},
 */

@Description("Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.If the element is present, it must have either a @value, an @id, or extensions")

public interface Group extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Group> T = EntityTypes.T(Group.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String code = "code";
	java.lang.String managingEntity = "managingEntity";
	java.lang.String characteristic = "characteristic";
	java.lang.String member = "member";

	@Description("A unique business identifier for this group.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Provides a specific type of resource the group includes; e.g. 'cow', 'syringe', etc.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Entity responsible for defining and maintaining Group characteristics and/or registered members.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingEntity();
	void setManagingEntity(com.braintribe.model.generic.GenericEntity managingEntity);
	@Description("Identifies traits whose presence r absence is shared by members of the group.")
	
	java.util.List<fhir.GroupCharacteristic> getCharacteristic();
	void setCharacteristic(java.util.List<fhir.GroupCharacteristic> characteristic);

	@Description("Identifies the resource instances that are members of the group.")
	
	java.util.List<fhir.GroupMember> getMember();
	void setMember(java.util.List<fhir.GroupMember> member);

}

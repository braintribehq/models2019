/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConstraint of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Name}, 
{@link Description}, 
{@link ConstraintGrade}, 
{@link ConstraintSource}, 
{@link CreatingActor}, 
{@link CreationTime}, 
{@link UserDefinedGrade}, 
{@link HasExternalReferences}, 
{@link PropertiesForConstraint}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getConstraintGrade},
{@link getConstraintSource},
{@link getCreatingActor},
{@link getCreationTime},
{@link getUserDefinedGrade},
{@link getHasExternalReferences},
{@link getPropertiesForConstraint},
{@link setName},
{@link setDescription},
{@link setConstraintGrade},
{@link setConstraintSource},
{@link setCreatingActor},
{@link setCreationTime},
{@link setUserDefinedGrade},
{@link setHasExternalReferences},
{@link setPropertiesForConstraint},
 */

@Description("")

public interface IfcConstraint extends GenericEntity, ifc4.IfcResourceObjectSelect {

	EntityType<IfcConstraint> T = EntityTypes.T(IfcConstraint.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String ConstraintGrade = "ConstraintGrade";
	java.lang.String ConstraintSource = "ConstraintSource";
	java.lang.String CreatingActor = "CreatingActor";
	java.lang.String CreationTime = "CreationTime";
	java.lang.String UserDefinedGrade = "UserDefinedGrade";
	java.lang.String HasExternalReferences = "HasExternalReferences";
	java.lang.String PropertiesForConstraint = "PropertiesForConstraint";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	ifc4.IfcConstraintEnum getConstraintGrade();
	void setConstraintGrade(ifc4.IfcConstraintEnum ConstraintGrade);
	@Description("")
	@Mandatory
	java.lang.String getConstraintSource();
	void setConstraintSource(java.lang.String ConstraintSource);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getCreatingActor();
	void setCreatingActor(ifc4.IfcActorSelect CreatingActor);
	@Description("")
	@Mandatory
	java.lang.String getCreationTime();
	void setCreationTime(java.lang.String CreationTime);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedGrade();
	void setUserDefinedGrade(java.lang.String UserDefinedGrade);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReferences();
	void setHasExternalReferences(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReferences);

	@Description("")
	
	java.util.List<ifc4.IfcResourceConstraintRelationship> getPropertiesForConstraint();
	void setPropertiesForConstraint(java.util.List<ifc4.IfcResourceConstraintRelationship> PropertiesForConstraint);

}

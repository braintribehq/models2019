/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyDependencyRelationship of the Data Model iai.
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
{@link DependingProperty}, 
{@link DependantProperty}, 
{@link Expression}, 

* It provides of then following operations (getters and setters)
{@link getDependingProperty},
{@link getDependantProperty},
{@link getExpression},
{@link setDependingProperty},
{@link setDependantProperty},
{@link setExpression},
 */

@Description("")

public interface IfcPropertyDependencyRelationship extends GenericEntity, ifc4.IfcResourceLevelRelationship {

	EntityType<IfcPropertyDependencyRelationship> T = EntityTypes.T(IfcPropertyDependencyRelationship.class);

	/* Constants for each property name. */
	java.lang.String DependingProperty = "DependingProperty";
	java.lang.String DependantProperty = "DependantProperty";
	java.lang.String Expression = "Expression";

	@Description("")
	@Mandatory
	ifc4.IfcProperty getDependingProperty();
	void setDependingProperty(ifc4.IfcProperty DependingProperty);
	@Description("")
	@Mandatory
	ifc4.IfcProperty getDependantProperty();
	void setDependantProperty(ifc4.IfcProperty DependantProperty);
	@Description("")
	@Mandatory
	java.lang.String getExpression();
	void setExpression(java.lang.String Expression);
}

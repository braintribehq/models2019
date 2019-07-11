/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcObjective of the Data Model iai.
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
{@link BenchmarkValues}, 
{@link LogicalAggregator}, 
{@link ObjectiveQualifier}, 
{@link UserDefinedQualifier}, 

* It provides of then following operations (getters and setters)
{@link getBenchmarkValues},
{@link getLogicalAggregator},
{@link getObjectiveQualifier},
{@link getUserDefinedQualifier},
{@link setBenchmarkValues},
{@link setLogicalAggregator},
{@link setObjectiveQualifier},
{@link setUserDefinedQualifier},
 */

@Description("")

public interface IfcObjective extends GenericEntity, ifc4.IfcConstraint {

	EntityType<IfcObjective> T = EntityTypes.T(IfcObjective.class);

	/* Constants for each property name. */
	java.lang.String BenchmarkValues = "BenchmarkValues";
	java.lang.String LogicalAggregator = "LogicalAggregator";
	java.lang.String ObjectiveQualifier = "ObjectiveQualifier";
	java.lang.String UserDefinedQualifier = "UserDefinedQualifier";

	@Description("")
	
	java.util.List<ifc4.IfcConstraint> getBenchmarkValues();
	void setBenchmarkValues(java.util.List<ifc4.IfcConstraint> BenchmarkValues);

	@Description("")
	@Mandatory
	ifc4.IfcLogicalOperatorEnum getLogicalAggregator();
	void setLogicalAggregator(ifc4.IfcLogicalOperatorEnum LogicalAggregator);
	@Description("")
	@Mandatory
	ifc4.IfcObjectiveEnum getObjectiveQualifier();
	void setObjectiveQualifier(ifc4.IfcObjectiveEnum ObjectiveQualifier);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedQualifier();
	void setUserDefinedQualifier(java.lang.String UserDefinedQualifier);
}

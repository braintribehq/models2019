/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProperty of the Data Model iai.
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
{@link PartOfPset}, 
{@link PropertyForDependance}, 
{@link PropertyDependsOn}, 
{@link PartOfComplex}, 
{@link HasConstraints}, 
{@link HasApprovals}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getPartOfPset},
{@link getPropertyForDependance},
{@link getPropertyDependsOn},
{@link getPartOfComplex},
{@link getHasConstraints},
{@link getHasApprovals},
{@link setName},
{@link setDescription},
{@link setPartOfPset},
{@link setPropertyForDependance},
{@link setPropertyDependsOn},
{@link setPartOfComplex},
{@link setHasConstraints},
{@link setHasApprovals},
 */

@Description("")

public interface IfcProperty extends GenericEntity, ifc4.IfcPropertyAbstraction {

	EntityType<IfcProperty> T = EntityTypes.T(IfcProperty.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String PartOfPset = "PartOfPset";
	java.lang.String PropertyForDependance = "PropertyForDependance";
	java.lang.String PropertyDependsOn = "PropertyDependsOn";
	java.lang.String PartOfComplex = "PartOfComplex";
	java.lang.String HasConstraints = "HasConstraints";
	java.lang.String HasApprovals = "HasApprovals";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcPropertySet> getPartOfPset();
	void setPartOfPset(java.util.List<ifc4.IfcPropertySet> PartOfPset);

	@Description("")
	
	java.util.List<ifc4.IfcPropertyDependencyRelationship> getPropertyForDependance();
	void setPropertyForDependance(java.util.List<ifc4.IfcPropertyDependencyRelationship> PropertyForDependance);

	@Description("")
	
	java.util.List<ifc4.IfcPropertyDependencyRelationship> getPropertyDependsOn();
	void setPropertyDependsOn(java.util.List<ifc4.IfcPropertyDependencyRelationship> PropertyDependsOn);

	@Description("")
	
	java.util.List<ifc4.IfcComplexProperty> getPartOfComplex();
	void setPartOfComplex(java.util.List<ifc4.IfcComplexProperty> PartOfComplex);

	@Description("")
	
	java.util.List<ifc4.IfcResourceConstraintRelationship> getHasConstraints();
	void setHasConstraints(java.util.List<ifc4.IfcResourceConstraintRelationship> HasConstraints);

	@Description("")
	
	java.util.List<ifc4.IfcResourceApprovalRelationship> getHasApprovals();
	void setHasApprovals(java.util.List<ifc4.IfcResourceApprovalRelationship> HasApprovals);

}

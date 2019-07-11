/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadTemperature of the Data Model iai.
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
{@link DeltaTConstant}, 
{@link DeltaTConstantAsString}, 
{@link DeltaTY}, 
{@link DeltaTYAsString}, 
{@link DeltaTZ}, 
{@link DeltaTZAsString}, 

* It provides of then following operations (getters and setters)
{@link getDeltaTConstant},
{@link getDeltaTConstantAsString},
{@link getDeltaTY},
{@link getDeltaTYAsString},
{@link getDeltaTZ},
{@link getDeltaTZAsString},
{@link setDeltaTConstant},
{@link setDeltaTConstantAsString},
{@link setDeltaTY},
{@link setDeltaTYAsString},
{@link setDeltaTZ},
{@link setDeltaTZAsString},
 */

@Description("")

public interface IfcStructuralLoadTemperature extends GenericEntity, ifc4.IfcStructuralLoadStatic {

	EntityType<IfcStructuralLoadTemperature> T = EntityTypes.T(IfcStructuralLoadTemperature.class);

	/* Constants for each property name. */
	java.lang.String DeltaTConstant = "DeltaTConstant";
	java.lang.String DeltaTConstantAsString = "DeltaTConstantAsString";
	java.lang.String DeltaTY = "DeltaTY";
	java.lang.String DeltaTYAsString = "DeltaTYAsString";
	java.lang.String DeltaTZ = "DeltaTZ";
	java.lang.String DeltaTZAsString = "DeltaTZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getDeltaTConstant();
	void setDeltaTConstant(java.lang.Double DeltaTConstant);
	@Description("")
	@Mandatory
	java.lang.String getDeltaTConstantAsString();
	void setDeltaTConstantAsString(java.lang.String DeltaTConstantAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDeltaTY();
	void setDeltaTY(java.lang.Double DeltaTY);
	@Description("")
	@Mandatory
	java.lang.String getDeltaTYAsString();
	void setDeltaTYAsString(java.lang.String DeltaTYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDeltaTZ();
	void setDeltaTZ(java.lang.Double DeltaTZ);
	@Description("")
	@Mandatory
	java.lang.String getDeltaTZAsString();
	void setDeltaTZAsString(java.lang.String DeltaTZAsString);
}

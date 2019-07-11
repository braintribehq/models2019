/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadSingleDisplacement of the Data Model iai.
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
{@link DisplacementX}, 
{@link DisplacementXAsString}, 
{@link DisplacementY}, 
{@link DisplacementYAsString}, 
{@link DisplacementZ}, 
{@link DisplacementZAsString}, 
{@link RotationalDisplacementRX}, 
{@link RotationalDisplacementRXAsString}, 
{@link RotationalDisplacementRY}, 
{@link RotationalDisplacementRYAsString}, 
{@link RotationalDisplacementRZ}, 
{@link RotationalDisplacementRZAsString}, 

* It provides of then following operations (getters and setters)
{@link getDisplacementX},
{@link getDisplacementXAsString},
{@link getDisplacementY},
{@link getDisplacementYAsString},
{@link getDisplacementZ},
{@link getDisplacementZAsString},
{@link getRotationalDisplacementRX},
{@link getRotationalDisplacementRXAsString},
{@link getRotationalDisplacementRY},
{@link getRotationalDisplacementRYAsString},
{@link getRotationalDisplacementRZ},
{@link getRotationalDisplacementRZAsString},
{@link setDisplacementX},
{@link setDisplacementXAsString},
{@link setDisplacementY},
{@link setDisplacementYAsString},
{@link setDisplacementZ},
{@link setDisplacementZAsString},
{@link setRotationalDisplacementRX},
{@link setRotationalDisplacementRXAsString},
{@link setRotationalDisplacementRY},
{@link setRotationalDisplacementRYAsString},
{@link setRotationalDisplacementRZ},
{@link setRotationalDisplacementRZAsString},
 */

@Description("")

public interface IfcStructuralLoadSingleDisplacement extends GenericEntity, ifc4.IfcStructuralLoadStatic {

	EntityType<IfcStructuralLoadSingleDisplacement> T = EntityTypes.T(IfcStructuralLoadSingleDisplacement.class);

	/* Constants for each property name. */
	java.lang.String DisplacementX = "DisplacementX";
	java.lang.String DisplacementXAsString = "DisplacementXAsString";
	java.lang.String DisplacementY = "DisplacementY";
	java.lang.String DisplacementYAsString = "DisplacementYAsString";
	java.lang.String DisplacementZ = "DisplacementZ";
	java.lang.String DisplacementZAsString = "DisplacementZAsString";
	java.lang.String RotationalDisplacementRX = "RotationalDisplacementRX";
	java.lang.String RotationalDisplacementRXAsString = "RotationalDisplacementRXAsString";
	java.lang.String RotationalDisplacementRY = "RotationalDisplacementRY";
	java.lang.String RotationalDisplacementRYAsString = "RotationalDisplacementRYAsString";
	java.lang.String RotationalDisplacementRZ = "RotationalDisplacementRZ";
	java.lang.String RotationalDisplacementRZAsString = "RotationalDisplacementRZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getDisplacementX();
	void setDisplacementX(java.lang.Double DisplacementX);
	@Description("")
	@Mandatory
	java.lang.String getDisplacementXAsString();
	void setDisplacementXAsString(java.lang.String DisplacementXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDisplacementY();
	void setDisplacementY(java.lang.Double DisplacementY);
	@Description("")
	@Mandatory
	java.lang.String getDisplacementYAsString();
	void setDisplacementYAsString(java.lang.String DisplacementYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDisplacementZ();
	void setDisplacementZ(java.lang.Double DisplacementZ);
	@Description("")
	@Mandatory
	java.lang.String getDisplacementZAsString();
	void setDisplacementZAsString(java.lang.String DisplacementZAsString);
	@Description("")
	@Mandatory
	java.lang.Double getRotationalDisplacementRX();
	void setRotationalDisplacementRX(java.lang.Double RotationalDisplacementRX);
	@Description("")
	@Mandatory
	java.lang.String getRotationalDisplacementRXAsString();
	void setRotationalDisplacementRXAsString(java.lang.String RotationalDisplacementRXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getRotationalDisplacementRY();
	void setRotationalDisplacementRY(java.lang.Double RotationalDisplacementRY);
	@Description("")
	@Mandatory
	java.lang.String getRotationalDisplacementRYAsString();
	void setRotationalDisplacementRYAsString(java.lang.String RotationalDisplacementRYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getRotationalDisplacementRZ();
	void setRotationalDisplacementRZ(java.lang.Double RotationalDisplacementRZ);
	@Description("")
	@Mandatory
	java.lang.String getRotationalDisplacementRZAsString();
	void setRotationalDisplacementRZAsString(java.lang.String RotationalDisplacementRZAsString);
}

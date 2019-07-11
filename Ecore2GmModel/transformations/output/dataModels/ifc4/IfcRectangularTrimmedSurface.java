/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRectangularTrimmedSurface of the Data Model iai.
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
{@link BasisSurface}, 
{@link U1}, 
{@link U1AsString}, 
{@link V1}, 
{@link V1AsString}, 
{@link U2}, 
{@link U2AsString}, 
{@link V2}, 
{@link V2AsString}, 
{@link Usense}, 
{@link Vsense}, 

* It provides of then following operations (getters and setters)
{@link getBasisSurface},
{@link getU1},
{@link getU1AsString},
{@link getV1},
{@link getV1AsString},
{@link getU2},
{@link getU2AsString},
{@link getV2},
{@link getV2AsString},
{@link getUsense},
{@link getVsense},
{@link setBasisSurface},
{@link setU1},
{@link setU1AsString},
{@link setV1},
{@link setV1AsString},
{@link setU2},
{@link setU2AsString},
{@link setV2},
{@link setV2AsString},
{@link setUsense},
{@link setVsense},
 */

@Description("")

public interface IfcRectangularTrimmedSurface extends GenericEntity, ifc4.IfcBoundedSurface {

	EntityType<IfcRectangularTrimmedSurface> T = EntityTypes.T(IfcRectangularTrimmedSurface.class);

	/* Constants for each property name. */
	java.lang.String BasisSurface = "BasisSurface";
	java.lang.String U1 = "U1";
	java.lang.String U1AsString = "U1AsString";
	java.lang.String V1 = "V1";
	java.lang.String V1AsString = "V1AsString";
	java.lang.String U2 = "U2";
	java.lang.String U2AsString = "U2AsString";
	java.lang.String V2 = "V2";
	java.lang.String V2AsString = "V2AsString";
	java.lang.String Usense = "Usense";
	java.lang.String Vsense = "Vsense";

	@Description("")
	@Mandatory
	ifc4.IfcSurface getBasisSurface();
	void setBasisSurface(ifc4.IfcSurface BasisSurface);
	@Description("")
	@Mandatory
	java.lang.Double getU1();
	void setU1(java.lang.Double U1);
	@Description("")
	@Mandatory
	java.lang.String getU1AsString();
	void setU1AsString(java.lang.String U1AsString);
	@Description("")
	@Mandatory
	java.lang.Double getV1();
	void setV1(java.lang.Double V1);
	@Description("")
	@Mandatory
	java.lang.String getV1AsString();
	void setV1AsString(java.lang.String V1AsString);
	@Description("")
	@Mandatory
	java.lang.Double getU2();
	void setU2(java.lang.Double U2);
	@Description("")
	@Mandatory
	java.lang.String getU2AsString();
	void setU2AsString(java.lang.String U2AsString);
	@Description("")
	@Mandatory
	java.lang.Double getV2();
	void setV2(java.lang.Double V2);
	@Description("")
	@Mandatory
	java.lang.String getV2AsString();
	void setV2AsString(java.lang.String V2AsString);
	@Description("")
	@Mandatory
	ifc4.Tristate getUsense();
	void setUsense(ifc4.Tristate Usense);
	@Description("")
	@Mandatory
	ifc4.Tristate getVsense();
	void setVsense(ifc4.Tristate Vsense);
}

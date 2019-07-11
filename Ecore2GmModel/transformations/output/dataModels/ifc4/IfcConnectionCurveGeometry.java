/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConnectionCurveGeometry of the Data Model iai.
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
{@link CurveOnRelatingElement}, 
{@link CurveOnRelatedElement}, 

* It provides of then following operations (getters and setters)
{@link getCurveOnRelatingElement},
{@link getCurveOnRelatedElement},
{@link setCurveOnRelatingElement},
{@link setCurveOnRelatedElement},
 */

@Description("")

public interface IfcConnectionCurveGeometry extends GenericEntity, ifc4.IfcConnectionGeometry {

	EntityType<IfcConnectionCurveGeometry> T = EntityTypes.T(IfcConnectionCurveGeometry.class);

	/* Constants for each property name. */
	java.lang.String CurveOnRelatingElement = "CurveOnRelatingElement";
	java.lang.String CurveOnRelatedElement = "CurveOnRelatedElement";

	@Description("")
	@Mandatory
	ifc4.IfcCurveOrEdgeCurve getCurveOnRelatingElement();
	void setCurveOnRelatingElement(ifc4.IfcCurveOrEdgeCurve CurveOnRelatingElement);
	@Description("")
	@Mandatory
	ifc4.IfcCurveOrEdgeCurve getCurveOnRelatedElement();
	void setCurveOnRelatedElement(ifc4.IfcCurveOrEdgeCurve CurveOnRelatedElement);
}

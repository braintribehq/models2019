/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurveStyleFontPattern of the Data Model iai.
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
{@link VisibleSegmentLength}, 
{@link VisibleSegmentLengthAsString}, 
{@link InvisibleSegmentLength}, 
{@link InvisibleSegmentLengthAsString}, 

* It provides of then following operations (getters and setters)
{@link getVisibleSegmentLength},
{@link getVisibleSegmentLengthAsString},
{@link getInvisibleSegmentLength},
{@link getInvisibleSegmentLengthAsString},
{@link setVisibleSegmentLength},
{@link setVisibleSegmentLengthAsString},
{@link setInvisibleSegmentLength},
{@link setInvisibleSegmentLengthAsString},
 */

@Description("")

public interface IfcCurveStyleFontPattern extends GenericEntity, ifc4.IfcPresentationItem {

	EntityType<IfcCurveStyleFontPattern> T = EntityTypes.T(IfcCurveStyleFontPattern.class);

	/* Constants for each property name. */
	java.lang.String VisibleSegmentLength = "VisibleSegmentLength";
	java.lang.String VisibleSegmentLengthAsString = "VisibleSegmentLengthAsString";
	java.lang.String InvisibleSegmentLength = "InvisibleSegmentLength";
	java.lang.String InvisibleSegmentLengthAsString = "InvisibleSegmentLengthAsString";

	@Description("")
	@Mandatory
	java.lang.Double getVisibleSegmentLength();
	void setVisibleSegmentLength(java.lang.Double VisibleSegmentLength);
	@Description("")
	@Mandatory
	java.lang.String getVisibleSegmentLengthAsString();
	void setVisibleSegmentLengthAsString(java.lang.String VisibleSegmentLengthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getInvisibleSegmentLength();
	void setInvisibleSegmentLength(java.lang.Double InvisibleSegmentLength);
	@Description("")
	@Mandatory
	java.lang.String getInvisibleSegmentLengthAsString();
	void setInvisibleSegmentLengthAsString(java.lang.String InvisibleSegmentLengthAsString);
}

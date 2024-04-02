import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-mostrarpublicidad')
export class VistaMostrarpublicidad extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%; height: 45%; flex-shrink: 0;" id="Layoutpublicidadsuperiormostrarpublidad">
  <vaadin-button style="background-color: white; width: 100%; height: 100%;" id="Anunciosuperiormostrarpublidad">
   <img style="width: 100%; height: 100%;" src="../../src/main/resources/META-INF/resources/images/anuncio1.jpg" id="Imagenpublicidadsuperiormostrarpublidad">
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 10%; flex-shrink: 0;" id="Layoutpublicidadetiquetamostrarpublidad">
  <vaadin-text-field label="" placeholder="Publicidad" style="align-self: center; flex-grow: 1; width: 100%;" id="Publicidadetiquetamostrarpublidad"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 45%; flex-shrink: 0;" id="Layoutpublicidadinferiormostrarpublidad">
  <vaadin-button style="background-color: white; width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0;" id="Publicidadinferiormostrarpublidad">
   <img style="width: 100%; height: 100%;" src="../../src/main/resources/META-INF/resources/images/anuncio2.jpg" id="Imagenpublicidadinferiormostrarpublidad">
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

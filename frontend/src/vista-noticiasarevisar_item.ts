import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-noticiasarevisar_item')
export class VistaNoticiasarevisar_item extends LitElement {
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
<vaadin-item selected id="Itemnoticiasarevisar">
 <vaadin-vertical-layout id="Layouttituloitemnoticiasarevisar" style="width: 100%; height: 100%;">
  titulo
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="Layouturlitemnoticiasarevisar" style="display: none;">
  url
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="display: none;" id="Layoutcontenidoitemnoticiasarevisar">
  contenido
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="display: none;" id="Layoutfechaitemnoticiasarevisar">
  fecha
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="display: none;" id="Layoutlugaritemnoticiasarevisar">
  lugar
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="display: none;" id="Layouttematicaitemnoticiasarevisar">
  tematica
 </vaadin-vertical-layout>
</vaadin-item>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

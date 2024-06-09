import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-noticiasenseccionidentificado_item')
export class VistaNoticiasenseccionidentificado_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; max-width: 400px; padding: 0; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-l); margin-bottom: var(--lumo-space-l);">
 <vaadin-vertical-layout style="flex-shrink: 0; height: 100%; width: 100%; padding: 0;" id="Layouttitulonoticiasenseccionidentificado">
  <vaadin-button style="flex-shrink: 0; width: 100%; background-color: #FFFFFF; flex-grow: 0; height: 100%; margin-left: var(--lumo-space-m); padding: 0;" id="Titulonoticiasenseccionidentificado">
    Título noticia 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;" id="Layoutimagennoticiasenseccionidentificado"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="Layoutautorlugarfechanoticiasenseccionidentificado" style="width: 100%; flex-shrink: 0; justify-content: space-between; flex-grow: 0;">
  <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Fechanoticiasenseccionidentificado">Fecha</label>
  <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Autornoticiasenseccionidentificado">Autor</label>
  <label style="flex-shrink: 0; height: 100%; width: 30%; text-align: center;" id="Lugarnoticiasenseccionidentificado">Lugar</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}